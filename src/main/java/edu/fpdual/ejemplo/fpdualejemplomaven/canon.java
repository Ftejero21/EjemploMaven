package edu.fpdual.ejemplo.fpdualejemplomaven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class canon {
    private String letra;
    private int frecuencia;

    @Override
    public String toString() {
        return "canon{" +
                "frecuencia=" + frecuencia +
                this.letra+'}';
    }
}
