# DiverJoy
This is an Android game.

## Software architecture
The following architecture is used in this application.
<img src="./used-software-architecture.png" />

<b>UI Layout:</b> The layouts of the application, where the view components are created using xml.

<b>Activities:</b> The activities are the representation of the UI, this class is going to manage
the different actions and contents of the view.

<b>Presenters:</b> The presenters are classes that wrap the logic of the activities and calls to
the services to execute specific actions.

<b>Listeners:</b> The listeners (using interfaces) are the actions that can be performed by the
activities and the presenters.

<b>Adapters:</b> The adapters are the classes that adapt the RecyclerViews to a list.

<b>Utils:</b> The utils are stateless classes (usually with static methods) for util general
operations.

<b>Services:</b> The services are for general logic operations, also they can use managers to make
some specific tasks.

<b>Managers:</b> The managers are the classes that perform a specific logic of an ambit of a
service. With this classes we are going to avoid the accumulation of logic in a single service.

<b>Async Tasks:</b> The async tasks are classes to make the logic of the application avoiding
the UI thread. In this way we will use the UI thread only for the UI actions. The async tasks
use the managers to call to the respective operations and also manages the listener to throw its
event when the operation has finished.

<b>Repositories:</b> The repositories are the classes that are connected to the database to throw
the respective queries. This classes are used by the managers.

<b>Entities:</b> The entities are the representation of the database into a programming classes.
In this case, each entity is a RealmObject, representing the class as the table, its attributes as
columns and each object instantiation as an registry. The entities are connected directly to the
database.

<b>Value objects:</b> The value objects represent the data of the database, to use it through the
whole application.

<b>DDBB:</b> The database where the data is located, in this app the database is in SQLite using
Realm as ORM.
