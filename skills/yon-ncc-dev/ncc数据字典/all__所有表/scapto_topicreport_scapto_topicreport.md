# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11385.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topicreport | pk_topicreport | pk_topicreport | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | bislistenadvice | bislistenadvice | bislistenadvice | char(1) |
| 5 | bisneedsuperve | bisneedsuperve | bisneedsuperve | char(1) |
| 6 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 7 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 8 | cfirstid | cfirstid | cfirstid | char(20) |
| 9 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 10 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 11 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 12 | csrcid | csrcid | csrcid | char(20) |
| 13 | dmakedate | dmakedate | dmakedate | char(19) |
| 14 | dmeetingdate | dmeetingdate | dmeetingdate | char(19) |
| 15 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 16 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 17 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 18 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 19 | pk_arrange | pk_arrange | pk_arrange | varchar2(50) |
| 20 | pk_arrangetopic | pk_arrangetopic | pk_arrangetopic | varchar2(50) |
| 21 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 22 | pk_decidemeetingform | pk_decidemeetingform | pk_decidemeetingform | varchar2(20) |  |  | '~' |
| 23 | pk_decidesubjecttype | pk_decidesubjecttype | pk_decidesubjecttype | varchar2(20) |  |  | '~' |
| 24 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 25 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 26 | pk_enterprise | pk_enterprise | pk_enterprise | varchar2(20) |  |  | '~' |
| 27 | pk_enterprisetopic | pk_enterprisetopic | pk_enterprisetopic | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | char(20) | √ |
| 29 | pk_matterlistreport | pk_matterlistreport | pk_matterlistreport | varchar2(20) |  |  | '~' |
| 30 | pk_matterrecord | pk_matterrecord | pk_matterrecord | varchar2(20) |  |  | '~' |
| 31 | pk_meetplan | pk_meetplan | pk_meetplan | varchar2(50) |
| 32 | pk_meetreport | pk_meetreport | pk_meetreport | varchar2(20) |  |  | '~' |
| 33 | pk_meetreport_ref | pk_meetreport_ref | pk_meetreport_ref | varchar2(20) |  |  | '~' |
| 34 | pk_meettopic | pk_meettopic | pk_meettopic | varchar2(20) |  |  | '~' |
| 35 | pk_meettopic_ref | pk_meettopic_ref | pk_meettopic_ref | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 39 | pk_specialtask | pk_specialtask | pk_specialtask | varchar2(20) |  |  | '~' |
| 40 | pk_tasksource | pk_tasksource | pk_tasksource | varchar2(20) |  |  | '~' |
| 41 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 42 | taudittime | taudittime | taudittime | char(19) |
| 43 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 44 | vbillcode | vbillcode | vbillcode | varchar2(50) | √ |
| 45 | vbillname | vbillname | vbillname | varchar2(2048) |
| 46 | vbillname2 | vbillname2 | vbillname2 | varchar2(2048) |
| 47 | vbillname3 | vbillname3 | vbillname3 | varchar2(2048) |
| 48 | vbillname4 | vbillname4 | vbillname4 | varchar2(2048) |
| 49 | vbillname5 | vbillname5 | vbillname5 | varchar2(2048) |
| 50 | vbillname6 | vbillname6 | vbillname6 | varchar2(2048) |
| 51 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 52 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 53 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 54 | vmemo | vmemo | vmemo | varchar2(4000) |
| 55 | vreporttogzw | vreporttogzw | vreporttogzw | varchar2(50) |
| 56 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 57 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 58 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 59 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 60 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 61 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 62 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 63 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 64 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 65 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 66 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 67 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 68 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 69 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 70 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 71 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 72 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 73 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 74 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 75 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 76 | vspecialtaskname | vspecialtaskname | vspecialtaskname | varchar2(2048) |
| 77 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 78 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 79 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 80 | vtasksource | vtasksource | vtasksource | varchar2(2048) |
| 81 | vtopiccode | vtopiccode | vtopiccode | varchar2(64) |
| 82 | vtopicmemo | vtopicmemo | vtopicmemo | varchar2(2048) |
| 83 | vtopicname | vtopicname | vtopicname | varchar2(2048) |
| 84 | vtopicpassstate | vtopicpassstate | vtopicpassstate | varchar2(50) |
| 85 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 86 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 87 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 88 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 89 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 90 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 91 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 92 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 93 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 94 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 95 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 96 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 97 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 98 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 99 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 100 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 101 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 102 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 103 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 104 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 105 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 106 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 107 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 108 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 109 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 110 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 111 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 112 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 113 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 114 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 115 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 116 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 117 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 118 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 119 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 120 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 121 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 122 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 123 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 124 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 125 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 126 | creationtime | creationtime | creationtime | char(19) |
| 127 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 128 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 129 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 130 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 131 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |