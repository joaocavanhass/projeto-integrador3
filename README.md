 <div class="container">
#   <h1>Lista de compras</h1>
   <form class="add-item" #frm="ngForm" (ngSubmit)="adicionarItem()">
#        <label for="item">Item desejado:</label>
#       <input type="text" name="item" id="item" [(ngModel)]="item">
#        <button type="submit">Adicionar</button>
#        <button type="button">Limpar</button>
#        <button type="button">Apagar</button>
#    </form>

    <table>
#        <thead>
#            <tr>
#                <th>#</th>
#                <th>Item</th>
#                <th>Realizado</th>
#                <th>Remover</th>
#            </tr>
#        </thead>

 #       <tbody>
 #           <!-- For each com Angular -->
 #           <!-- <tr *ngFor="let item of items; let i = index">
 #               <td>{{ item.id }}</td>
 #               <td>{{ item.nome }}</td>
 #               <td><input type="checkbox" name="" id=""></td>
 #               <td><button>Remover</button></td>
 #           </tr> -->

 #           @for(item of items; track item.id) {
 #               <tr> 
 #                   <td>{{ item.id }}</td>
 #                   <td>{{ item.nome }}</td>
 #                   <td><input type="checkbox" name="" id=""></td>
 #                   <td><button>Remover</button></td>
 #               </tr>
 #           } @empty {
 #               <tr>
 #                   <td colspan="4">Nenhum item adicionado!</td>
 #               </tr>
 #           }
 #       </tbody>
 #   </table>
 # </div>
