package org.example;

public enum CompassDirection {
        E,
        N,
        S,
        W;

        public CompassDirection turnLeft() {
                if (this == N) { // user inputs current value
                        return W;  // North -> West
                } else if (this == W) {
                        return S;  // West -> South
                } else if (this == S) {
                        return E;  // South -> East
                } else {  // this == E
                        return N;  // East -> North
                }
        }

        public CompassDirection turnRight() {
                if (this == N) { // user inputs
                        return E;  // North -> East
                } else if (this == E) {
                        return S;  // East -> South
                } else if (this == S) {
                        return W;  // South -> West
                } else {  // this == W
                        return N;  // West -> North
                }
        }
}


