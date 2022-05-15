
# Rapport

Först så skapades en Mountain.java class public klassen Mountain, i den så skrevs tre variablar 
(name, location och size) och som blir kallade av constructorn tack vare användningen av "this"
sedan så skapades getters och setters av dem. Det sista som skrivs i mountain klassen är en 
toString för att kunna hämta datan. sedan i post execute så skrevs parsing kod vilket listar antal 
element i mountain listan. 

Efter detta så lades det till user permisson till internet för att kunna använda internetet.
Sedan så lades länken till i JSON_URL och JsonTask(this).execute(JSON_URL); lades till.
Efter det så skapades en Adapter och Viewholder samt en recyclerview i activity_main och 
en item_mountain xml lista, med hjälp av dessa så kan vi printa ut på skärmen en lista med alla berg
vilket 

```
    //Mountain.java
    public Mountain(String name, String location, int size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }
    ...
    ...
    ...
    @Override
    public String toString() {
        return name + " has an altitude of " + size + "m above sea level";
    }
    
    //MainActivity.java
        new JsonFile(this, this).execute(JSON_FILE);
        //Fetch from url
        new JsonTask(this).execute(JSON_URL);

        recyclerView =findViewById(R.id.Recycle_view);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    
    //MyAdapter.java
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent, false);
        return new MyViewHolder(view);
    }
    
    //MyViewHolder.java
    public class    MyViewHolder extends RecyclerView.ViewHolder {
    public TextView name;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
    }
}
    
    
```

Bilder läggs i samma mapp som markdown-filen.

![](NetworkingMountainList.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
