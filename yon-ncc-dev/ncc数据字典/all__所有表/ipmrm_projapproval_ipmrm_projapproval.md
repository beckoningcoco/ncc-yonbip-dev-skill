# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projapproval | pk_projapproval | pk_projapproval | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | asset_possessor | asset_possessor | asset_possessor | varchar2(400) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | bill_date | bill_date | bill_date | char(19) |
| 6 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 7 | cfirstid | cfirstid | cfirstid | char(20) |
| 8 | csrcid | csrcid | csrcid | varchar2(50) |  |  | '~' |
| 9 | devalstanddate | devalstanddate | devalstanddate | char(19) |
| 10 | dmakedate | dmakedate | dmakedate | char(19) |
| 11 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 12 | nallassetbookmny | nallassetbookmny | nallassetbookmny | number(28, 8) |
| 13 | nallassetevalmny | nallassetevalmny | nallassetevalmny | number(28, 8) |
| 14 | nalldebtbookmny | nalldebtbookmny | nalldebtbookmny | number(28, 8) |
| 15 | nalldebtevalmny | nalldebtevalmny | nalldebtevalmny | number(28, 8) |
| 16 | nallnetassetbookmny | nallnetassetbookmny | nallnetassetbookmny | number(28, 8) |
| 17 | nallnetassetevalmny | nallnetassetevalmny | nallnetassetevalmny | number(28, 8) |
| 18 | nbaseassetbookmny | nbaseassetbookmny | nbaseassetbookmny | number(28, 8) |
| 19 | nbaseassetevalmny | nbaseassetevalmny | nbaseassetevalmny | number(28, 8) |
| 20 | nbasedebtbookmny | nbasedebtbookmny | nbasedebtbookmny | number(28, 8) |
| 21 | nbasedebtevalmny | nbasedebtevalmny | nbasedebtevalmny | number(28, 8) |
| 22 | nbasenetassetbookmny | nbasenetassetbookmny | nbasenetassetbookmny | number(28, 8) |
| 23 | nbasenetassetevalmny | nbasenetassetevalmny | nbasenetassetevalmny | number(28, 8) |
| 24 | ngpassetbookmny | ngpassetbookmny | ngpassetbookmny | number(28, 8) |
| 25 | ngpassetevalmny | ngpassetevalmny | ngpassetevalmny | number(28, 8) |
| 26 | ngpdebtbookmny | ngpdebtbookmny | ngpdebtbookmny | number(28, 8) |
| 27 | ngpdebtevalmny | ngpdebtevalmny | ngpdebtevalmny | number(28, 8) |
| 28 | ngpnetassetbookmny | ngpnetassetbookmny | ngpnetassetbookmny | number(28, 8) |
| 29 | ngpnetassetevalmny | ngpnetassetevalmny | ngpnetassetevalmny | number(28, 8) |
| 30 | norigassetbookmny | norigassetbookmny | norigassetbookmny | number(28, 8) |
| 31 | norigassetbookthousmny | norigassetbookthousmny | norigassetbookthousmny | number(28, 8) |
| 32 | norigassetevalmny | norigassetevalmny | norigassetevalmny | number(28, 8) |
| 33 | norigassetevalthousmny | norigassetevalthousmny | norigassetevalthousmny | number(28, 8) |
| 34 | norigdebtbookmny | norigdebtbookmny | norigdebtbookmny | number(28, 8) |
| 35 | norigdebtbookthousmny | norigdebtbookthousmny | norigdebtbookthousmny | number(28, 8) |
| 36 | norigdebtevalmny | norigdebtevalmny | norigdebtevalmny | number(28, 8) |
| 37 | norigdebtevalthousmny | norigdebtevalthousmny | norigdebtevalthousmny | number(28, 8) |
| 38 | norignetassetbookmny | norignetassetbookmny | norignetassetbookmny | number(28, 8) |
| 39 | norignetassetbookthousmny | norignetassetbookthousmny | norignetassetbookthousmny | number(28, 8) |
| 40 | norignetassetevalmny | norignetassetevalmny | norignetassetevalmny | number(28, 8) |
| 41 | norignetassetevalthousmny | norignetassetevalthousmny | norignetassetevalthousmny | number(28, 8) |
| 42 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 43 | pk_group | pk_group | pk_group | char(20) | √ |
| 44 | pk_group_company | pk_group_company | pk_group_company | varchar2(20) |  |  | '~' |
| 45 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 46 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 47 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 48 | taudittime | taudittime | taudittime | char(19) |
| 49 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 50 | vasset_location | vasset_location | vasset_location | varchar2(20) |  |  | '~' |
| 51 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 52 | vcertificate_code | vcertificate_code | vcertificate_code | varchar2(100) |
| 53 | venterprise_level | venterprise_level | venterprise_level | varchar2(50) |
| 54 | veval_org_name | veval_org_name | veval_org_name | varchar2(300) |
| 55 | veval_pri_method | veval_pri_method | veval_pri_method | varchar2(150) |
| 56 | veval_proj_name | veval_proj_name | veval_proj_name | varchar2(300) |
| 57 | veval_proj_name2 | veval_proj_name2 | veval_proj_name2 | varchar2(300) |
| 58 | veval_proj_name3 | veval_proj_name3 | veval_proj_name3 | varchar2(300) |
| 59 | veval_proj_name4 | veval_proj_name4 | veval_proj_name4 | varchar2(300) |
| 60 | veval_proj_name5 | veval_proj_name5 | veval_proj_name5 | varchar2(300) |
| 61 | veval_proj_name6 | veval_proj_name6 | veval_proj_name6 | varchar2(300) |
| 62 | veval_purpose | veval_purpose | veval_purpose | varchar2(3072) |
| 63 | veval_scope | veval_scope | veval_scope | varchar2(50) |
| 64 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 65 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 66 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 67 | vhigher_unit | vhigher_unit | vhigher_unit | varchar2(300) |
| 68 | vmemo | vmemo | vmemo | varchar2(3072) |
| 69 | vregevaluator_code | vregevaluator_code | vregevaluator_code | varchar2(50) |
| 70 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 71 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 72 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 73 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 74 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 75 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 76 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 77 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 78 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 79 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 80 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 81 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 82 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 83 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 84 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 85 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 86 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 87 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 88 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 89 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 90 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 91 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 92 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 93 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 94 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 95 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 96 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 97 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 98 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 99 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 100 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 101 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 102 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 103 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 104 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 105 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 106 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 107 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 108 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 109 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 110 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 111 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 112 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 113 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 114 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 115 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 116 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 117 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 118 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 119 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 120 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 121 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 122 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 123 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 124 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 125 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 126 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 127 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 128 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 129 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 130 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 131 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 132 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 133 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 134 | creationtime | creationtime | creationtime | char(19) |
| 135 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 136 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 137 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 138 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 139 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |