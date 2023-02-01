
import 'package:flutter/material.dart';

class DetalhesSigno extends StatelessWidget {

  String _nome;
  String _imagem;
  String _dataInicio;
  String _dataFim;
  String _descricao;

  DetalhesSigno(Map signo){
    this._nome = signo['Nome'];
    this._imagem = signo['Imagem'];
    this._dataInicio = signo['DataInicio'];
    this._dataFim = signo['DataFim'];
    this._descricao = signo['Descricao'];
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
     appBar: AppBar(
       title: Text("Signo: Aquário"),
       centerTitle: true,
     ),
     body: Center(
        child: Padding(
          padding: EdgeInsets.all(25),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [

              Image.asset("img/aquarios.jpg", width: 200),

              SizedBox(height: 30),
              
              Text(
                "Aquário", style: TextStyle(fontSize: 28, fontWeight: FontWeight.bold), textAlign: TextAlign.center
              ),

              SizedBox(height: 15),

              Text(
                "21/01 - 19/02", style: TextStyle(fontSize: 18)
              ),

              SizedBox(height: 30),

              Text('Características: ', style: TextStyle( color: Colors.black, fontSize: 18, fontWeight: FontWeight.bold)),
              
              SizedBox(height: 10),

              Text("Inovação, originalidade e independência", style: TextStyle( color: Colors.black, fontSize: 16))

            ],
          ),
        ),
      ),
    );
  }
}