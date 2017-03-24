# RPG_Java
###### By Alexandre DE PEMBROKE, Loïc FOREST  and Josselin PEREZ

## Changelog
### V1.2 - *24/03/2017*
#### GENERAL
- Add a GUI
- End of game now provides a success table to sum your adventure up
- If you want to add a DB to keep your scores, you'll have to use a uWamp-like and create the following :
        
        || java
            ˫ score
                ˫ id (integer, auto-incremental)
                ˫ pseudo (varchar(255))
                ˫ score (integer)
                ˪ heroType (varchar(255))

#### HEROES
- Dwarves are now slower and hobbits faster
- Hobbits hit with less power but heal the best
- Heroes can now get a name !

#### EVENTS
- Obstacles are now fully working, they have different levels and you'll be rewarded or punished depending on the extent of your success
- Your success or failure on obstacles will greatly depend on your hero's stats
- Fights, obstacles and taverns are now provided with pictures for a more graphical experience
- Major rework on ennemies stats and the way the game handles them and their death

### V1.1 - *20/03/2017*
#### HEROES
- Each hero now moves more randomly at the beginning of each turn
- Fix a bug where tavern healings would top up the maximum of 100PV
- Add more random in combat turns

#### EVENTS
- Even more random events in the tavern !


### V 1.0 - *17/03/2017*
#### GENERAL
- First version
- Text only

#### HEROES
- Choose between 4 races :
    - Human
    - Dwarf
    - Hobbit
    - Elf
   
#### EVENTS
- Stumble through a 100-step game board and meet random events such as :
    - An outgoing woman in a tavern
    - A ferocious centaurus at the edge of a great forest
    - An a sh*tload of other events !
    