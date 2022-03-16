# Primeros pasos
***Para empezar a aprender el funcionamiento de GitHub***

**Para poder empezar a realizar el trabajo debemos instalar Git primero** 
- Una vez instalado Git, podemos empezar a trabajar con el proyecto. Realizamos un Git init para indicar el inicio e insertamos seguidamente un Git remote add (enlace de nuestro github) para que lo detecte y se sincronice.
- Tras haber sincronizado nuestro Entorno con GitHub, debemos hacer un Git add . seguido de un Git commit -m (nombre que queremos) y un git tag v1.0.0 (indicando la primera versión) y realizamos nuestro primer push con un git push y un git push --tags para actualizar nuestro github con la primera versión.
- Una vez hecho esto creamos la rama "2" (en nuestro caso) con git branch 2 y hacemos un git checkout 2 para cambiar a la nueva ramificación. Una vez cambiado, hacemos dos refactorizaciones (cambio de nombre y sacamos el interface) y guardamos los cambios. Al finalizar, vamos a la rama principal de nuevo y realizamos un git merge 2 (que a nosotros nos petó) y se actualiza la rama master con la última información actualizando la versión,.
- Repetimos el anterior proceso con la rama 3 (sin errores esta vez) acabando con nuestra primera práctica. PD: Casi lloramos en el proceso
