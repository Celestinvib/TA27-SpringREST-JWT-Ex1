# TA27-SpringREST-JWT-Ex1
### Detalles a tener en cuenta 
#### Posible error:

Heroku al crear algunas app de este paquete de ejercicios (sin llegar a hacer deploy de la rama) al entrar en la vista me daba un error de que la página no estaba devolciendo ningun dato (como si no existiese) y después de x tiempo se ponía la página de bienvenida, al hacer el deploy del jwt funcionaba todo correctamente pero entraba unas horas más tarde y me salía el mismo error (no como cuando te da error indicando que mires el log) , al cabo de media hora volvía a funcionar correctamente.

Al no encontrar información al respecto online y comprobando que falla heroku , no la aplicación.Ya que cuando la página iba todos los endpoints funcionaban correctamente, he creado otras app para todo el paquete de ejercicios asumiendo que puedes ser un error con el nombre de la app o que heroku justo estas no las ha creado bien

#### Muestra del correcto funcionando de la app: (En caso de que vuelva a pasar)
![image](https://user-images.githubusercontent.com/55434881/186721082-ad12dd03-f33a-47b7-94f3-93443afa391e.png)

![image](https://user-images.githubusercontent.com/55434881/186721147-c7e513ee-2057-42b7-bacc-dca51f2fa562.png)

### URIs endpoints:
Deploy-Heroku-BasicSecurity -> https://cka-ta27-ex1.herokuapp.com

Deploy-Heroku-JWT -> https://cka-ta27-ex1jwt.herokuapp.com

```
Proveedores
GET       /api/proveedores
POST      /api/proveedores
GET       /api/proveedores/{id}
PUT       /api/proveedores/{id}
DELETE    /api/proveedores/{id}

Piezas
GET       /api/piezas
POST      /api/piezas
GET       /api/piezas/{id}
PUT       /api/piezas/{id}
DELETE    /api/piezas/{id}

Suministros
GET       /api/suministros
POST      /api/suministros
GET       /api/suministros/{id}
PUT       /api/suministros/{id}
DELETE    /api/suministros/{id}

```

![Spring2](https://user-images.githubusercontent.com/55434881/186718931-2024b357-6b4b-4545-9c58-9d68339c032f.JPG)
