insert ignore into tb_perfil(id, nome)
values(1, "admin");

insert ignore into tb_usuario(id, email, senha, perfil_id)
values(1, "Admin", "$2a$12$Jq8rEv6ZA0qsZt71oKbOp.V5dCzO7H/DS4zxyy9DjB0lEAOrKChYe", 1);

insert ignore into tb_deputado(id, cpf, cep, complemento, logradouro, numero,   foto, nome, nome_partido, sigla, tel_celular, tel_residencia, lider)
values(1, "758.094.008-68", "08080-80", "fundos", "Rua vitoria", "228", "https://cdn.pixabay.com/photo/2012/04/13/21/31/fish-33712_960_720.png", "Naruto", "Konoha", "KH", "(11)1111-1111", "(11)8711-2213", true),
(2, "519.174.568-08", "055055-55", "Travessa", "Rua Montanha Azul", "5000", "https://cdn.pixabay.com/photo/2017/11/06/18/30/eggplant-2924511_960_720.png", "Saski", "Konoha", "KH", "(11)1234-9871", "(11)2212-1341", false),
(3, "706.184.648-83", "05784-947", "Avenida", "Vila da folha", "7998", "https://cdn.pixabay.com/photo/2013/07/13/11/44/penguin-158551_960_720.png", "Kakashi", "Konoha", "KH", "(11)7631-9373", "(11)2124-2124", false),
(4, "674.011.308-40", "07859-28", "Casa Azul", "Red Line", "1", "https://cdn.pixabay.com/photo/2014/10/02/08/30/honey-bee-469560_960_720.png", "Itachi", "Konoha", "KH", "(11)1244-5671", "(11)9871-1244", false);

insert ignore into deputado_projeto_de_lei(deputado_id, projeto_de_lei)
values(1, "Tornar Konoha a melhor Vila"),
(1, "Lamem Gratuito para o hokage"),
(2, "Vingar todos os Uchihas"),
(2, "Prender o Naruto"),
(3, "Distribuir revistas"),
(3, "Uso Obrigatorio de mascaras"),
(4, "Distanciamento obrigatorio de irmãos"),
(4, "Aposentadoria maior para ex-ninjas"),
(1, "tornar sapos animais de estimação"),
(1, "Oferecer adoção para orfãos de guerra"),
(2, "Acabar com Konoha"),
(3, "Distribuir ração gratuita para cachorros"),
(4, "Tornar Konoha a maior vila"),
(4, "Matar todos os Uchihas");

insert ignore into  tb_vereador(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "505.131.478-37", "08031-452", "casa azul", "Rua Particular B", "10", "https://cdn.pixabay.com/photo/2013/07/13/13/42/snake-161424_960_720.png", "Ichigo","Soul City", "SC", "(11)92435-1256", "(11)1513-1245"),
(2, "910.677.638-80", "02841-040", "Terra", "Rua José da Costa Vieira", "1233", "https://cdn.pixabay.com/photo/2013/07/13/13/42/snake-161424_960_720.png", "Rukia", "Soul City", "SC", "(11)92435-1256", "(11)2151-11251"),
(3, "649.572.708-99", "06709-350", "Ceu", "Rua Jerusalém", "2834", "https://cdn.pixabay.com/photo/2016/04/01/09/29/cartoon-1299393_960_720.png", "Inoue", "Soul City", "SC", "(11)92435-1256", "(11)1234-1336"),
(4, "838.621.058-30", "08021-971", "5° distrito", "Avenida Nordestina", "903", "https://cdn.pixabay.com/photo/2013/07/12/18/20/santa-claus-153309_960_720.png", "Kenpachi", "Soul City", "SC", "(11)92435-1256", "(11)2125-3461"),
(5, "406.750.368-79", "07724-270", "79° Distrito", "Avenida Prefeito Doutor Milton Ferreira Neves", "193", "https://cdn.pixabay.com/photo/2016/05/12/23/03/lamb-1388937_960_720.png", "Aizen", "Soul City", "SC", "(11)92435-1256", "(11)2326-23525"),
(6, "787.575.738-08", "06826-055", "1° Distrito", "Praça Cândida Maria da Silva", "100", "https://cdn.pixabay.com/photo/2016/05/26/14/39/parrot-1417286_960_720.png", "Urahara", "Soul City", "SC", "(11)92435-1256", "(11)3256-3662");


insert ignore into vereador_projeto_de_lei(vereador_id, projeto_de_lei)
values(1, "Facil acesso para a soul City"),
(1, "Treinamento de espada nas escolas"),
(2, "Blusa de frio melhroes"),
(2, "Expandir estação de inverno"),
(3, "Adicional de Isalubridade"),
(3, "Melhorar Qualidade de vida do Trabalhador"),
(4, "Liberar matar todo mundo"),
(4, "Obrigação de uso de tampão no olho "),
(5, "Me tornar o Deus de todos os mundos"),
(5, "Poder destruir todos que são contra mim"),
(6, "Melhores condições de Aposentadoria"),
(6, "Sigilos de endereço de ex-guerreiros"),
(1, "Escola aceitarem justificativas de salvar o mundo"),
(2, "Terapia para irmãos");

insert ignore into vereador_processos(vereador_id, processos)
values(1, "Falta a escola sem motivos"),
(1, "Brigas com companeiros de escola"),
(2, "Congelar Vias publicas "),
(2, "Destruir patrimonio Publico"),
(3, "Mal tratos de Senhores de idade"),
(3, "Mal comportamento na sala de Aula "),
(4, "Destruição de patrimonio do Governo"),
(4, "Agreção de inocentes"),
(5, "Tentativa de Liderança obrigatoria"),
(5, "Destruição da Terra"),
(6, "Negação de Origens"),
(6, "Falsificação de identidade"),
(1, "Uso de arma Branca em locais publicos"),
(2, "Furto de Automoveis");

insert ignore into  tb_governador(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "717.031.878-49", "14781-360", "casa de campo", "Travessa Alegria", "10", "https://cdn.pixabay.com/photo/2017/01/31/20/15/dino-2026962_960_720.png", "Goku","Dragon Ball", "DB", "(15)92355-1256", "(15)3513-1245"),
(2, "205.257.168-07", "18409-640", "corporação Capsula", "Avenida Expedicionários de Itapeva", "1233", "https://cdn.pixabay.com/photo/2012/04/02/15/18/stegosaurus-24752_960_720.png", "Bumma", "Dragon Ball", "DB", "(15)92235-1256", "(11)2151-11251"),
(3, "504.198.268-66", "13972-394", "ilha", "Rua Oscar Dias da Silva", "2834", "https://cdn.pixabay.com/photo/2012/04/02/15/18/stegosaurus-24752_960_720.png", "Kuririn", "Dragon Ball", "DB", "(15)92235-1256", "(15)1354-1336"),
(4, "070.308.218-31", "03059-023", "Centro", "Rua Fernandes Vieira", "903", "https://cdn.pixabay.com/photo/2013/07/13/13/14/tiger-160601_960_720.png", "Gohan", "Dragon Ball", "DB", "(15)92435-1256", "(15)2125-3461"),
(5, "543.790.138-04", "09920-595", "7° Andar", "Passagem Maria Inês Gouveia Damázio", "193", "https://cdn.pixabay.com/photo/2017/05/16/10/10/shark-2317422_960_720.png", "Vegeta", "Dragon Ball", "DB", "(15)94625-1256", "(15)2223-23525"),
(6, "636.539.358-06", "17522-750", "Ceu", "Rua Olívio Luzia", "100", "https://cdn.pixabay.com/photo/2016/04/15/20/08/butterfly-fish-1331812_960_720.png", "Picolo", "Dragon Ball", "DB", "(15)91235-1256", "(15)3242-3662");


insert ignore into governador_projeto_de_lei(governador_id, projeto_de_lei)
values(1, "Aumento do vale alimentação"),
(1, "Proteção para macacos"),
(2, "Financiamento para novas tecnologias"),
(2, "Proteção para mulheres Cientistas contra aliens"),
(3, "Implante capilar para guerreiros"),
(3, "Aumento de vezes para renascimento"),
(4, "Universidade Gratuita para jovens Saiyajin"),
(4, "Aumento de pensão para crianças orfans"),
(5, "Titulo de maior guerreiro do universo"),
(5, "Tornar os Saiyajins os governantes do universo"),
(6, "Pintar todos de verdes"),
(6, "Criar a religião Namikaze"),
(1, "Distribuir Refeições Gratuitas para salvadores da terra"),
(2, "Legalizar casamento de terraquios com Aliens");

insert ignore into governador_processos(governador_id, processos)
values(1, "Destruição de patrimonio Publico"),
(1, "Comer sem pagar"),
(2, "Utilização de tecnologias proibidas"),
(2, "Uso indevido do espaço aereo"),
(3, "Falsificação de atestado de obito"),
(3, "Mortes em Excesso"),
(4, "Parar de Lutar para estudadar"),
(4, "Abandono de Mãe"),
(5, "Tentativa de Aniquilação de terraquios"),
(5, "Destruição da Terra"),
(6, "Negação de Origens"),
(6, "Falsificação de identidade"),
(1, "Uso de força contra policia"),
(2, "Furto de Automoveis");



insert ignore into  tb_senador(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "308.614.758-01", "08655-353", "Barril", "Rua João Justo Bueno", "10", "https://cdn.pixabay.com/photo/2014/03/24/17/08/swordfish-295149_960_720.png", "Chaves","El Chavo", "EC", "(24)92355-1256", "(24)3513-1245"),
(2, "127.667.718-91", "04776-133", "Casa da mae", "Rua Doutor Brasílio Machado Neto", "14", "https://cdn.pixabay.com/photo/2012/04/26/19/07/crab-42880_960_720.png", "Kiko", "El Chavo", "EC", "(24)92235-1256", "(24)2151-11251"),
(3, "947.815.108-84", "13456-134", "casa do pai ", "Rua João Covolan Filho", "2834", "https://cdn.pixabay.com/photo/2017/02/01/11/04/animal-2029675_960_720.png", "Chiquina", "El Chavo", "EC", "(24)92235-1256", "(24)1354-1336"),
(4, "600.142.408-07", "09837-312", "casa de frente da entrada", "Rua Rio Turvo", "72", "https://cdn.pixabay.com/photo/2014/12/21/23/58/lobster-576487_960_720.png", "Sr.Madruga", "El Chavo", "EC", "(24)92435-1256", "(24)2125-3461"),
(5, "082.527.898-89", "11676-260", "Fundos", "Avenida Jardim", "193", "https://cdn.pixabay.com/photo/2013/07/13/14/06/gingerbread-162141_960_720.png", "Dona Florinda", "El Chavo", "EC", "(24)94625-1256", "(24)2223-23525"),
(6, "930.842.788-06", "13730-400", "casa mal assombrada", "Rua Prudente de Moraes", "71", "https://cdn.pixabay.com/photo/2012/04/25/00/44/dolphin-41436_960_720.png", "Bruxa do 71", "El Chavo", "EC", "(24)91235-1256", "(24)3242-3662");


insert ignore into senador_projeto_de_lei(senador_id, projeto_de_lei)
values(1, "Aumento do vale alimentação"),
(1, "Caf´da manha para todas as crianças de rua"),
(2, "Criação de uma bola quadrada"),
(2, "Aumento de pensão alimenticia"),
(3, "Distribuição de Óculos"),
(3, "Defesa de pobres meninas indefesas"),
(4, "Aumento do auxilio moradia"),
(4, "Aumento de tempo do auxilio desemprego"),
(5, "Cabelereiro gratuito para viuvas"),
(5, "Auxilio de pilates para mulheres"),
(6, "Proteção de idosos"),
(6, "Proteção para gatos"),
(1, "Lei de proteção para jovens"),
(2, "Aumento da maior idade para 30 anos");


insert ignore into  tb_ministro(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "262.694.228-68", "13170-630", "Rua Principal", "Rua Abílio Francheschini", "10", "https://cdn.pixabay.com/photo/2012/04/02/15/05/elephant-24722_960_720.png", "Mickey","Walt Disney", "WD", "(82)92355-1256", "(82)3513-1245"),
(2, "824.067.658-81", "13347-380", "Casa Azul", "Rua Victório Emmanuel Soliani", "14", "https://cdn.pixabay.com/photo/2012/04/02/15/09/elephant-24732_960_720.png", "Donlad", "Walt Disney", "WD", "(82)92235-1256", "(82)2151-11251"),
(3, "839.574.488-91", "24943-830", "Sem portão ", "Rua das Bananeiras", "2834", "https://cdn.pixabay.com/photo/2016/08/16/16/39/elephant-1598359_960_720.png", "Pluto", "Walt Disney", "WD", "(82)92235-1256", "(82)1354-1336"),
(4, "604.508.688-00", "26083-175", "casa de frente", "Rua Tânia Maria", "72", "https://cdn.pixabay.com/photo/2012/04/24/16/15/broccoli-40295_960_720.png", "Miney", "Walt Disney", "WD", "(82)92435-1256", "(82)2125-3461"),
(5, "134.756.108-09", "28893-800", "Fundos", "Rua Nildon Lustosa", "193", "https://cdn.pixabay.com/photo/2012/04/05/00/40/garlic-25382_960_720.png", "Pateta", "Walt Disney", "WD", "(82)94625-1256", "(82)2223-23525"),
(6, "051.685.808-40", "26299-189", "Floresta", "Rua Mataripe", "71", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png", "Mufasa", "Walt Disney", "WD", "(82)91235-1256", "(82)3242-3662");


insert ignore into ministro_projeto_de_lei(ministro_id, projeto_de_lei)
values(1, "Aumento dos Direitos dos ratos"),
(1, "Aumento de participação dos lucros "),
(2, "Uso de calças"),
(2, "Não consumo de aves nas refeições"),
(3, "Carnes em todas refeições"),
(3, "Direito dos cachorros dormirem dentro de casa"),
(4, "Igualdade de salarios entre generos"),
(4, "Mulheres unidas jamais serão vencidas"),
(5, "Plano de saude"),
(5, "Mais empregos para cachorros falantes"),
(6, "Plante mais arvores"),
(6, "Proteção contra o desmatamento florestal"),
(1, "Lei de proteção para jovens ratos"),
(2, "Fonoaldiologo para todos");


insert ignore into  tb_prefeito(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "065.367.688-33", "69914-374", "Rua Principal", "Rua Cruzeiro do Sul", "10", "https://cdn.pixabay.com/photo/2013/07/13/13/49/demon-161607_960_720.png", "Homen Aranha","Marvel", "MV", "(68)92355-1256", "(68)3513-1245"),
(2, "752.086.878-87", "69921-172", "Casa Azul", "Rua Laranjeira", "14", "https://cdn.pixabay.com/photo/2015/10/16/01/08/dog-990304_960_720.jpg", "Hulk", "Marvel", "MV", "(68)92235-1256", "(68)2151-11251"),
(3, "970.831.848-52", "69908-010", "Sem portão ", "Travessa 25 de Dezembro", "2834", "https://cdn.pixabay.com/photo/2012/04/26/18/41/banana-42793_960_720.png", "Thanos", "Marvel", "MV", "(68)92235-1256", "(68)1354-1336"),
(4, "175.443.418-52", "69920-322", "casa de frente", "Rua B", "72", "https://cdn.pixabay.com/photo/2013/07/13/11/29/cherries-158241_960_720.png", "Thor", "Marvel", "MV", "(68)92435-1256", "(68)2125-3461"),
(5, "387.332.038-06", "69921-707", "Fundos", "Travessa Guanabara", "193", "https://cdn.pixabay.com/photo/2012/04/18/12/54/strawberry-36949_960_720.png", "Doutro Estranho", "Marvel", "MV", "(68)94625-1256", "(68)2223-23525"),
(6, "838.130.878-08", "69918-282", "Floresta", "Rua Fernando Lira", "71", "https://cdn.pixabay.com/photo/2012/04/05/00/41/peppers-25384_960_720.png", "Pantera Negra", "Marvel", "MV", "(68)91235-1256", "(68)3242-3662");


insert ignore into prefeito_projeto_de_lei(prefeito_id, projeto_de_lei)
values(1, "Aumento dos Direitos das Aranhas"),
(1, "Aumento do piso salarial para Fotografos"),
(2, "Distribuição de roubas GGG"),
(2, "Terapia gratuita para pessoas Stressadas"),
(3, "Redução de metade dos seres vivos do universo"),
(3, "Extinguir os Vingadores"),
(4, "Aumento de Aposentadoria para ex-Herois"),
(4, "Proibição de para raios"),
(5, "Passaporte de transição entre universos"),
(5, "Legalização da magica"),
(6, "Reconhecimento da Nação Wakanda"),
(6, "Proteção contra o desmatamento florestal"),
(1, "Lei de proteção para jovens Aranhas"),
(2, "Fonoaldiologo para todos");

insert ignore into  tb_presidente(id, cpf, cep, complemento, logradouro, numero, foto, nome, nome_partido, sigla, tel_celular, tel_residencia)
values(1, "019.696.468-70", "41205-615", "Rua Principal", "Travessa Muricy", "10", "https://cdn.pixabay.com/photo/2014/04/08/17/42/bell-peppers-319381_960_720.png", "Luffy","One Piece", "OP", "(71)92355-1256", "(71)3513-1245"),
(2, "881.738.728-21", "40045-190", "Casa Azul", "Rua Bota de Ouro", "14", "https://cdn.pixabay.com/photo/2014/12/21/23/33/cabbage-575525_960_720.png", "Nami", "One Piece", "OP", "(71)92235-1256", "(71)2151-11251"),
(3, "208.776.598-77", "41510-844", "Sem portão ", "Rua Fluminense", "2834", "https://cdn.pixabay.com/photo/2012/04/13/01/51/hamburger-31775_960_720.png", "Ussop", "One Piece", "OP", "(71)92235-1256", "(71)1354-1336"),
(4, "715.159.658-80", "41390-805", "casa de frente", "Alameda Vila dos Coqueiros", "72", "https://cdn.pixabay.com/photo/2013/07/13/09/36/pizza-155771_960_720.png", "Zoro", "One Piece", "OP", "(71)92435-1256", "(71)2125-3461"),
(5, "711.816.198-58", "40750-500", "Fundos", "Rua Zaire", "193", "https://cdn.pixabay.com/photo/2013/07/13/01/21/popcorn-155602_960_720.png", "Sanji", "One Piece", "OP", "(71)94625-1256", "(71)2223-23525"),
(6, "364.189.268-62", "41310-258", "Floresta", "Travessa Amazonas", "71", "https://cdn.pixabay.com/photo/2014/04/03/10/44/sandwich-311262_960_720.png", "Nico Robin","One Piece", "OP", "(71)91235-1256", "(71)3242-3662");


insert ignore into presidente_projeto_de_lei(presidente_id, projeto_de_lei)
values(1, "Aumento do auxilio alimentação"),
(1, "Distribuição de Carne para todos"),
(2, "Auxilio joias e Ouros"),
(2, "diminuição de Penas a pequenos furtos"),
(3, "Liberação para contos e historias"),
(3, "Proteção para jovens medrosos"),
(4, "Aula de espadas para todos"),
(4, "Se tornar o maios espadachin do mundo"),
(5, "Aula de gastronomia a todos"),
(5, "Lei de proteção a crianças"),
(6, "Lei de proteção a testemunhas"),
(6, "Proteção contra agressão a mulher"),
(1, "Proteção a jovens piratas"),
(2, "Distribuição de ouros para piratas");
