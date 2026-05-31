# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assetseval | pk_assetseval | pk_assetseval | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 8 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 9 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 10 | csrcid | csrcid | csrcid | char(20) |
| 11 | devalstand_time | devalstand_time | devalstand_time | char(19) |
| 12 | devalvalid_time_to | devalvalid_time_to | devalvalid_time_to | char(19) |
| 13 | dlegalperson_signtime | dlegalperson_signtime | dlegalperson_signtime | char(19) |
| 14 | dmakedate | dmakedate | dmakedate | char(19) |
| 15 | drecordtime | drecordtime | drecordtime | char(19) |
| 16 | dupperleader_signtime | dupperleader_signtime | dupperleader_signtime | char(19) |
| 17 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 18 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 19 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 20 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 21 | pk_accept_enterprise | pk_accept_enterprise | pk_accept_enterprise | varchar2(20) |  |  | '~' |
| 22 | pk_contr_enterprise | pk_contr_enterprise | pk_contr_enterprise | varchar2(20) |  |  | '~' |
| 23 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 24 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | char(20) | √ |
| 26 | pk_nationasserteval | pk_nationasserteval | pk_nationasserteval | varchar2(20) |  |  | '~' |
| 27 | pk_nonnationasserteval | pk_nonnationasserteval | pk_nonnationasserteval | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_propright_unit | pk_propright_unit | pk_propright_unit | varchar2(20) |  |  | '~' |
| 31 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 32 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 33 | taudittime | taudittime | taudittime | char(19) |
| 34 | vaccept_addr | vaccept_addr | vaccept_addr | varchar2(200) |
| 35 | vaccept_concat | vaccept_concat | vaccept_concat | varchar2(300) |
| 36 | vaccept_concat2 | vaccept_concat2 | vaccept_concat2 | varchar2(300) |
| 37 | vaccept_concat3 | vaccept_concat3 | vaccept_concat3 | varchar2(300) |
| 38 | vaccept_concat4 | vaccept_concat4 | vaccept_concat4 | varchar2(300) |
| 39 | vaccept_concat5 | vaccept_concat5 | vaccept_concat5 | varchar2(300) |
| 40 | vaccept_concat6 | vaccept_concat6 | vaccept_concat6 | varchar2(300) |
| 41 | vaccept_phone | vaccept_phone | vaccept_phone | varchar2(50) |
| 42 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 43 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 44 | vbillname | vbillname | vbillname | varchar2(800) |
| 45 | vcertificate_code | vcertificate_code | vcertificate_code | varchar2(50) |
| 46 | vcontr_addr | vcontr_addr | vcontr_addr | varchar2(200) |
| 47 | vcontr_concat | vcontr_concat | vcontr_concat | varchar2(300) |
| 48 | vcontr_concat2 | vcontr_concat2 | vcontr_concat2 | varchar2(300) |
| 49 | vcontr_concat3 | vcontr_concat3 | vcontr_concat3 | varchar2(300) |
| 50 | vcontr_concat4 | vcontr_concat4 | vcontr_concat4 | varchar2(300) |
| 51 | vcontr_concat5 | vcontr_concat5 | vcontr_concat5 | varchar2(300) |
| 52 | vcontr_concat6 | vcontr_concat6 | vcontr_concat6 | varchar2(300) |
| 53 | vcontr_phone | vcontr_phone | vcontr_phone | varchar2(50) |
| 54 | vdelegation_code | vdelegation_code | vdelegation_code | varchar2(20) |  |  | '~' |
| 55 | vdelegation_name | vdelegation_name | vdelegation_name | varchar2(300) |
| 56 | vdelegation_name2 | vdelegation_name2 | vdelegation_name2 | varchar2(300) |
| 57 | vdelegation_name3 | vdelegation_name3 | vdelegation_name3 | varchar2(300) |
| 58 | vdelegation_name4 | vdelegation_name4 | vdelegation_name4 | varchar2(300) |
| 59 | vdelegation_name5 | vdelegation_name5 | vdelegation_name5 | varchar2(300) |
| 60 | vdelegation_name6 | vdelegation_name6 | vdelegation_name6 | varchar2(300) |
| 61 | venterprise_level | venterprise_level | venterprise_level | varchar2(50) |
| 62 | veval_obj | veval_obj | veval_obj | varchar2(300) |
| 63 | veval_obj2 | veval_obj2 | veval_obj2 | varchar2(300) |
| 64 | veval_obj3 | veval_obj3 | veval_obj3 | varchar2(300) |
| 65 | veval_obj4 | veval_obj4 | veval_obj4 | varchar2(300) |
| 66 | veval_obj5 | veval_obj5 | veval_obj5 | varchar2(300) |
| 67 | veval_obj6 | veval_obj6 | veval_obj6 | varchar2(300) |
| 68 | veval_org_name | veval_org_name | veval_org_name | varchar2(300) |
| 69 | veval_org_name2 | veval_org_name2 | veval_org_name2 | varchar2(300) |
| 70 | veval_org_name3 | veval_org_name3 | veval_org_name3 | varchar2(300) |
| 71 | veval_org_name4 | veval_org_name4 | veval_org_name4 | varchar2(300) |
| 72 | veval_org_name5 | veval_org_name5 | veval_org_name5 | varchar2(300) |
| 73 | veval_org_name6 | veval_org_name6 | veval_org_name6 | varchar2(300) |
| 74 | veval_pri_method | veval_pri_method | veval_pri_method | varchar2(300) |
| 75 | veval_pri_method2 | veval_pri_method2 | veval_pri_method2 | varchar2(300) |
| 76 | veval_pri_method3 | veval_pri_method3 | veval_pri_method3 | varchar2(300) |
| 77 | veval_pri_method4 | veval_pri_method4 | veval_pri_method4 | varchar2(300) |
| 78 | veval_pri_method5 | veval_pri_method5 | veval_pri_method5 | varchar2(300) |
| 79 | veval_pri_method6 | veval_pri_method6 | veval_pri_method6 | varchar2(300) |
| 80 | veval_proj_name | veval_proj_name | veval_proj_name | varchar2(300) |
| 81 | veval_proj_name2 | veval_proj_name2 | veval_proj_name2 | varchar2(300) |
| 82 | veval_proj_name3 | veval_proj_name3 | veval_proj_name3 | varchar2(300) |
| 83 | veval_proj_name4 | veval_proj_name4 | veval_proj_name4 | varchar2(300) |
| 84 | veval_proj_name5 | veval_proj_name5 | veval_proj_name5 | varchar2(300) |
| 85 | veval_proj_name6 | veval_proj_name6 | veval_proj_name6 | varchar2(300) |
| 86 | veval_report_code | veval_report_code | veval_report_code | varchar2(50) |
| 87 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 88 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 89 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 90 | vlegal_person | vlegal_person | vlegal_person | varchar2(300) |
| 91 | vlegal_person2 | vlegal_person2 | vlegal_person2 | varchar2(300) |
| 92 | vlegal_person3 | vlegal_person3 | vlegal_person3 | varchar2(300) |
| 93 | vlegal_person4 | vlegal_person4 | vlegal_person4 | varchar2(300) |
| 94 | vlegal_person5 | vlegal_person5 | vlegal_person5 | varchar2(300) |
| 95 | vlegal_person6 | vlegal_person6 | vlegal_person6 | varchar2(300) |
| 96 | vmemo | vmemo | vmemo | varchar2(2048) |
| 97 | vmoney_unit | vmoney_unit | vmoney_unit | varchar2(300) |  |  | '锟斤拷锟斤拷锟斤拷锟皆？' |
| 98 | vmoney_unit2 | vmoney_unit2 | vmoney_unit2 | varchar2(300) |
| 99 | vmoney_unit3 | vmoney_unit3 | vmoney_unit3 | varchar2(300) |
| 100 | vmoney_unit4 | vmoney_unit4 | vmoney_unit4 | varchar2(300) |
| 101 | vmoney_unit5 | vmoney_unit5 | vmoney_unit5 | varchar2(300) |
| 102 | vmoney_unit6 | vmoney_unit6 | vmoney_unit6 | varchar2(300) |
| 103 | vpropright_addr | vpropright_addr | vpropright_addr | varchar2(200) |
| 104 | vpropright_concat | vpropright_concat | vpropright_concat | varchar2(300) |
| 105 | vpropright_concat2 | vpropright_concat2 | vpropright_concat2 | varchar2(300) |
| 106 | vpropright_concat3 | vpropright_concat3 | vpropright_concat3 | varchar2(300) |
| 107 | vpropright_concat4 | vpropright_concat4 | vpropright_concat4 | varchar2(300) |
| 108 | vpropright_concat5 | vpropright_concat5 | vpropright_concat5 | varchar2(300) |
| 109 | vpropright_concat6 | vpropright_concat6 | vpropright_concat6 | varchar2(300) |
| 110 | vpropright_phone | vpropright_phone | vpropright_phone | varchar2(50) |
| 111 | vregevaluator_code_one | vregevaluator_code_one | vregevaluator_code_one | varchar2(50) |
| 112 | vregevaluator_code_two | vregevaluator_code_two | vregevaluator_code_two | varchar2(50) |
| 113 | vregevaluator_name_one | vregevaluator_name_one | vregevaluator_name_one | varchar2(300) |
| 114 | vregevaluator_name_one2 | vregevaluator_name_one2 | vregevaluator_name_one2 | varchar2(300) |
| 115 | vregevaluator_name_one3 | vregevaluator_name_one3 | vregevaluator_name_one3 | varchar2(300) |
| 116 | vregevaluator_name_one4 | vregevaluator_name_one4 | vregevaluator_name_one4 | varchar2(300) |
| 117 | vregevaluator_name_one5 | vregevaluator_name_one5 | vregevaluator_name_one5 | varchar2(300) |
| 118 | vregevaluator_name_one6 | vregevaluator_name_one6 | vregevaluator_name_one6 | varchar2(300) |
| 119 | vregevaluator_name_two | vregevaluator_name_two | vregevaluator_name_two | varchar2(300) |
| 120 | vregevaluator_name_two2 | vregevaluator_name_two2 | vregevaluator_name_two2 | varchar2(300) |
| 121 | vregevaluator_name_two3 | vregevaluator_name_two3 | vregevaluator_name_two3 | varchar2(300) |
| 122 | vregevaluator_name_two4 | vregevaluator_name_two4 | vregevaluator_name_two4 | varchar2(300) |
| 123 | vregevaluator_name_two5 | vregevaluator_name_two5 | vregevaluator_name_two5 | varchar2(300) |
| 124 | vregevaluator_name_two6 | vregevaluator_name_two6 | vregevaluator_name_two6 | varchar2(300) |
| 125 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 126 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 127 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 128 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 129 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 130 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 131 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 132 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 133 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 134 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 135 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 136 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 137 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 138 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 139 | vupper_leader | vupper_leader | vupper_leader | varchar2(300) |
| 140 | vupper_leader2 | vupper_leader2 | vupper_leader2 | varchar2(300) |
| 141 | vupper_leader3 | vupper_leader3 | vupper_leader3 | varchar2(300) |
| 142 | vupper_leader4 | vupper_leader4 | vupper_leader4 | varchar2(300) |
| 143 | vupper_leader5 | vupper_leader5 | vupper_leader5 | varchar2(300) |
| 144 | vupper_leader6 | vupper_leader6 | vupper_leader6 | varchar2(300) |
| 145 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 146 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 147 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 148 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 149 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 150 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 151 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 152 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 153 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 154 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 155 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 156 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 157 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 158 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 159 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 160 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 161 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 162 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 163 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 164 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 165 | creationtime | creationtime | creationtime | char(19) |
| 166 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 167 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 168 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 169 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 170 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |