package main

import "fmt"

func main() {
    var T int
    _, err := fmt.Scanf("%d", &T)
    if err != nil {
        fmt.Print(err)
    }
    for i := 0; i < T; i++ {
        var N int
        var M int
        var item int
        sum := 0
        fmt.Scanf("%d", &N)
        fmt.Scanf("%d", &M)
        
        for j := 0; j < N; j++ {
            fmt.Scanf("%d", &item)
            sum += item
        }
        fmt.Printf("Case #%v: %v\n", i+1, sum%M)
    }
}
