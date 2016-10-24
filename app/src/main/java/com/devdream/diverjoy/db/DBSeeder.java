package com.devdream.diverjoy.db;

import android.util.Log;

import com.devdream.diverjoy.consts.Consts;
import com.devdream.diverjoy.context.AppContext;
import com.devdream.diverjoy.entities.Game;
import com.devdream.diverjoy.entities.Question;
import com.devdream.diverjoy.entities.Topic;
import com.devdream.diverjoy.entities.Word;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;

public class DBSeeder {

    private Realm realm;
    private RealmConfiguration configuration;


    public DBSeeder() {
        Realm.init(AppContext.getContext());
        configuration = new RealmConfiguration
                .Builder()
                .schemaVersion(Consts.Database.SCHEMA_VERSION)
                .deleteRealmIfMigrationNeeded()
                .build();
        realm = Realm.getInstance(configuration);
    }

    public void seed() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                try {
                    seedGames();
                } catch (RealmPrimaryKeyConstraintException e) {
                    Log.i(Consts.LogTag.INFO, "Already seeded the DDBB");
                }
            }
        });
    }

    // TODO Temporal solution, need to check better if DDBB is created
    private void seedGames() throws RealmPrimaryKeyConstraintException {
        Game game1 = realm.createObject(Game.class, 1);
        game1.setName("Tabu");
        game1.setDescription("Tabu is an awesome game where you need to");

        Game game2 = realm.createObject(Game.class, 2);
        game2.setName("Mímica");
        game2.setDescription("Intenta adivinar lo que tus amig@s NO pueden decir");

        Game game3 = realm.createObject(Game.class, 3);
        game3.setName("Yo nunca");
        game3.setDescription("¿Lo has hecho alguna vez?");

        Question q1 = realm.createObject(Question.class, 1);
        q1.setQuestion("¿La has chupado alguna vez?");

        Question q2 = realm.createObject(Question.class, 2);
        q2.setQuestion("¿Has estado dentro de un bar de ocio?");

        Question q3 = realm.createObject(Question.class, 3);
        q3.setQuestion("¿Con alguien de los que estas le consideras feo?");

        RealmList<Question> questions = new RealmList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        game3.setQuestions(questions);

        Topic t1 = realm.createObject(Topic.class, 1);
        t1.setTopic("Paises");

        Topic t2 = realm.createObject(Topic.class, 2);
        t2.setTopic("Acciones");

        Topic t3 = realm.createObject(Topic.class, 3);
        t3.setTopic("Sentimientos");

        Word w1 = realm.createObject(Word.class, 1);
        w1.setWord("Asia");

        Word w2 = realm.createObject(Word.class, 2);
        w2.setWord("Cantar");

        Word w3 = realm.createObject(Word.class, 3);
        w3.setWord("Amor");
    }
}
