 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   h e l a b a s a . H B S u f f i x S e t ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n s ;  
 i m p o r t   j a v a . u t i l . C o m p a r a t o r ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B N o u n C o n j u g a t i o n R u l e s   {  
  
 	 p r i v a t e   L i s t < H B T r a n s f o r m R u l e >   l i s t _ D e r i v e d F o r m R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	  
 	 p r i v a t e   L i s t < H B T r a n s f o r m R u l e >   l i s t _ B i G r a m R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	  
 	 p r i v a t e   L i s t < H B T r a n s f o r m R u l e S e t >   l i s t _ R u l e S e t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e S e t > ( ) ;  
 	  
 	 H B S u f f i x S e t   o _ B a s e R u l e S u f f i x e s   =   n e w   H B S u f f i x S e t ( ) ;  
 	 H B S u f f i x S e t   o _ D e r i v e d R u l e S u f f i x e s   =   n e w   H B S u f f i x S e t ( ) ;  
 	 H B S u f f i x S e t   o _ B i G r a m R u l e S u f f i x e s   =   n e w   H B S u f f i x S e t ( ) ;  
 	 	 	  
 	 p u b l i c   H B N o u n C o n j u g a t i o n R u l e s ( )   { 	  
 	 	 H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e . L o a d R u l e s ( l i s t _ R u l e S e t ) ;  
 	 	  
 	 	 C o l l e c t i o n s . s o r t ( l i s t _ R u l e S e t ,   n e w   C o m p a r a t o r < H B T r a n s f o r m R u l e S e t > ( )   { 	 	  
                         @ O v e r r i d e  
                         p u b l i c   i n t   c o m p a r e ( H B T r a n s f o r m R u l e S e t   l h s ,   H B T r a n s f o r m R u l e S e t   r h s )   {  
                                 / /   - 1   -   l e s s   t h a n ,   1   -   g r e a t e r   t h a n ,   0   -   e q u a l ,   a l l   i n v e r s e d   f o r   d e s c e n d i n g  
                                 r e t u r n   l h s . G e t R a n k ( )   >   r h s . G e t R a n k ( )   ?   - 1   :   ( l h s . G e t R a n k ( )   <   r h s . G e t R a n k ( )   )   ?   1   :   0 ;  
                         }  
                 } ) ; 	 	  
 	 	  
 	 	 L o a d D e r i v e d F o r m R u l e s ( ) ;  
 	 	 L o a d B i G r a m R u l e s ( ) ;  
 	 	 P o p u l a t e S u f f i x e s ( ) ;  
 	 }  
  
 	 p r i v a t e   v o i d   L o a d B i G r a m R u l e s ( )  
 	 { 	 	  
 	 	 A d d B i G r a m R u l e ( " K T - D S = K R  ������ " ) ; 	 	  
 	 	 A d d B i G r a m R u l e ( " K T - I S = K R  ������ " ) ;  
 	 	 A d d B i G r a m R u l e ( " K T - P L = K R  ������ " ) ;  
 	 	  
 	 	 A d d B i G r a m R u l e ( " A D - D S = K R  ��� " ) ; 	 	  
 	 	 A d d B i G r a m R u l e ( " A D - I S = K R  ��� " ) ;  
 	 	 A d d B i G r a m R u l e ( " A D - P L = K R  ��� " ) ;  
 	 	  
 	 	 A d d B i G r a m R u l e ( " A D - D S = K R  ������ " ) ; 	 	  
 	 	 A d d B i G r a m R u l e ( " A D - I S = K R  ������ " ) ;  
 	 	 A d d B i G r a m R u l e ( " A D - P L = K R  ������ " ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d B i G r a m R u l e ( S t r i n g   s R u l e )  
 	 {  
 	 	 H B T r a n s f o r m R u l e   o R u l e   =   H B T r a n s f o r m R u l e . E x t r a c t R u l e ( s R u l e ) ;  
 	 	 i f ( o R u l e ! = n u l l )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " A d d B i G r a m R u l e   :   T y p e = "   +   o R u l e . G e t T y p e ( )   +   "   :   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( )   +   "   :   S u f f i x = "   +   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 l i s t _ B i G r a m R u l e s . a d d ( o R u l e ) ;  
 	 	 }  
 	 }  
 	 	  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e >   G e t B i G r a m R u l e s ( )  
 	 {  
 	 	 r e t u r n   l i s t _ B i G r a m R u l e s ;  
 	 }  
  
 	 p r i v a t e   v o i d   L o a d D e r i v e d F o r m R u l e s ( )  
 	 { 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - D S = K R���� " ) ; 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - I S = K R���� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - P L = K R���� " ) ;  
 	 	 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - D S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - D S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - I S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " K A - P L = K R����� " ) ;  
 	 	 	 	 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " S P - D S = K R� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S P - I S = K R� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S P - I S = K R +�� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S P - P L = K R� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S P - P L = K R��� " ) ;  
 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - D S = K R���� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - I S = K R���� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - P L = K R���� " ) ;  
  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - D S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - D S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - I S = K R +��� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " A V - P L = K R����� " ) ; 	 	  
 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - D S = K R�� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - I S = K R�� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - P L = K R�� " ) ;  
 	 	  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - D S = K R +� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - I S = K R� " ) ;  
 	 	 A d d D e r i v e d F o r m R u l e ( " S M - P L = K R�� " ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d D e r i v e d F o r m R u l e ( S t r i n g   s R u l e )  
 	 {  
 	 	 H B T r a n s f o r m R u l e   o R u l e   =   H B T r a n s f o r m R u l e . E x t r a c t R u l e ( s R u l e ) ;  
 	 	 i f ( o R u l e ! = n u l l )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " A d d D e r i v e d F o r m R u l e   :   T y p e = "   +   o R u l e . G e t T y p e ( )   +   "   :   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( )   +   "   :   S u f f i x = "   +   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 l i s t _ D e r i v e d F o r m R u l e s . a d d ( o R u l e ) ;  
 	 	 }  
 	 }  
 	 	  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e >   G e t D e r i v e d F o r m R u l e s ( )  
 	 {  
 	 	 r e t u r n   l i s t _ D e r i v e d F o r m R u l e s ;  
 	 } 	  
 	  
 	  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e S e t >   G e t R u l e S e t L i s t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B S u f f i x S e t   G e t B a s e S u f f i x e s ( )  
 	 {  
 	 	 r e t u r n   o _ B a s e R u l e S u f f i x e s ;  
 	 }  
 	  
 	  
 	 p u b l i c   H B S u f f i x S e t   G e t D e r i v e d S u f f i x e s ( )  
 	 {  
 	 	 r e t u r n   o _ D e r i v e d R u l e S u f f i x e s ;  
 	 }  
 	  
 	 p u b l i c   H B S u f f i x S e t   G e t B i G r a m S u f f i x e s ( )  
 	 {  
 	 	 r e t u r n   o _ B i G r a m R u l e S u f f i x e s ;  
 	 } 	  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t B y N a m e ( S t r i n g   s N a m e )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 i f ( o R u l e S e t . G e t N a m e ( ) . e q u a l s ( s N a m e ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e S e t ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t B y I D ( i n t   i I D )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 i f ( o R u l e S e t . G e t I D ( ) = = i I D )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e S e t ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p r i v a t e   v o i d   P o p u l a t e S u f f i x e s ( )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 	 	 	  
 	 	 	 i n t   i R u l e C o u n t   =   o R u l e S e t . G e t R u l e C o u n t ( ) ;  
 	 	 	  
 	 	 	 f o r ( i n t   j = 0 ;   j < i R u l e C o u n t ;   j + + )  
 	 	 	 {  
 	 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   o R u l e S e t . G e t R u l e ( j ) ;  
 	 	 	 	 o _ B a s e R u l e S u f f i x e s . A d d S u f f i x ( o R u l e ) ; 	 	 	 	  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	  
 	 	 i n t   i F i x e d C o u n t   =   l i s t _ D e r i v e d F o r m R u l e s . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i F i x e d C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ D e r i v e d F o r m R u l e s . g e t ( i ) ; 	 	 	 	  
 	 	 	 o _ D e r i v e d R u l e S u f f i x e s . A d d S u f f i x ( o R u l e ) ; 	 	 	 	 	 	 	 	 	  
 	 	 }  
 	 	  
 	 	 i n t   i B i G r a m C o u n t   =   l i s t _ B i G r a m R u l e s . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i B i G r a m C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ B i G r a m R u l e s . g e t ( i ) ; 	 	 	 	  
 	 	 	 o _ B i G r a m R u l e S u f f i x e s . A d d S u f f i x ( o R u l e ) ; 	 	 	 	 	 	 	 	 	  
 	 	 } 	 	 	  
 	 }  
 	  
 }  
