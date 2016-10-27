package com.devdream.diverjoy.db;

import android.util.Log;

import com.devdream.diverjoy.utils.Consts;
import com.devdream.diverjoy.db.entities.Game;
import com.devdream.diverjoy.db.entities.Question;
import com.devdream.diverjoy.db.entities.Topic;
import com.devdream.diverjoy.db.entities.Word;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;

public class DBSeeder {

    public void seed() {
        Realm realm = Realm.getInstance(RealmHelper.getRealmConfiguration());
        realm.beginTransaction();
        try {
            seedGames(realm);
        } catch (RealmPrimaryKeyConstraintException e) {
            Log.e(Consts.LogTag.ERROR, "DDBB Already seeded");
        } finally {
            realm.commitTransaction();
            realm.close();
        }
    }

    private void seedGames(Realm realm) throws RealmPrimaryKeyConstraintException {
        Game game1 = realm.createObject(Game.class, Consts.Games.TABOO_ID);
        game1.setName("Tabu");
        game1.setDescription("Tabu is an awesome game where you need to");
        game1.setCardColor("#2196F3");

        Game game2 = realm.createObject(Game.class, Consts.Games.MIME_ID);
        game2.setName("Mímica");
        game2.setDescription("Intenta adivinar lo que tus amig@s NO pueden decir");
        game2.setCardColor("#283593");

        Game game3 = realm.createObject(Game.class, Consts.Games.I_NEVER_ID);
        game3.setName("Yo nunca");
        game3.setDescription("¿Lo has hecho alguna vez?");
        game3.setCardColor("#FF1744");

        Question q1 = realm.createObject(Question.class, 1);
        q1.setQuestion("¿La has chupado alguna vez?");

        Question q2 = realm.createObject(Question.class, 2);
        q2.setQuestion("¿Has estado dentro de un bar de ocio?");

        Question q3 = realm.createObject(Question.class, 3);
        q3.setQuestion("¿Con alguien de los que estas le consideras feo?");

        Question q4 = realm.createObject(Question.class, 4);
        q3.setQuestion("Yo nunca he conducido una moto sin carnet");

        Question q5 = realm.createObject(Question.class, 5);
        q3.setQuestion("Yo nunca he querido recibir al pizzero en ropa interior");

        Question q6 = realm.createObject(Question.class, 6);
        q3.setQuestion("Yo nunca me he desnudade frente a una webcam");

        Question q7 = realm.createObject(Question.class, 7);
        q3.setQuestion("Yo nunca le he pedido entrar a una chica primero para verla el culo");

        Question q8 = realm.createObject(Question.class, 8);
        q3.setQuestion("Yo nunca he visto porno en el móvil");

        RealmList<Question> questions = new RealmList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        questions.add(q4);
        questions.add(q5);
        questions.add(q6);
        questions.add(q7);
        questions.add(q8);
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
