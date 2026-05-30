# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9410.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cancel_equity | pk_cancel_equity | pk_cancel_equity | char(20) | √ |
| 2 | administrative_area | administrative_area | administrative_area | varchar2(20) |  |  | '~' |
| 3 | approved_date | approved_date | approved_date | char(19) |
| 4 | approved_number | approved_number | approved_number | varchar2(50) |
| 5 | approved_unit | approved_unit | approved_unit | varchar2(50) |
| 6 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | bill_date | bill_date | bill_date | char(19) |
| 9 | busi_end_date | busi_end_date | busi_end_date | char(19) |
| 10 | busi_start_date | busi_start_date | busi_start_date | char(19) |
| 11 | busi_unit | busi_unit | busi_unit | varchar2(20) |  |  | '~' |
| 12 | cancelcause | cancelcause | cancelcause | varchar2(3072) |
| 13 | canceldate | canceldate | canceldate | char(19) |
| 14 | cancelled | cancelled | cancelled | char(1) |
| 15 | cancelnumber | cancelnumber | cancelnumber | varchar2(500) |
| 16 | cancelunit | cancelunit | cancelunit | varchar2(500) |
| 17 | cbilltypecode | cbilltypecode | cbilltypecode | varchar2(20) |
| 18 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 19 | cfirstid | cfirstid | cfirstid | char(20) |
| 20 | cglobalcurrencyid | cglobalcurrencyid | cglobalcurrencyid | varchar2(20) |  |  | '~' |
| 21 | cgroupcurrencyid | cgroupcurrencyid | cgroupcurrencyid | varchar2(20) |  |  | '~' |
| 22 | competent_depart | competent_depart | competent_depart | varchar2(75) |
| 23 | competent_unit | competent_unit | competent_unit | varchar2(75) |
| 24 | contact_one | contact_one | contact_one | varchar2(50) |
| 25 | contact_three | contact_three | contact_three | varchar2(50) |
| 26 | contact_two | contact_two | contact_two | varchar2(50) |
| 27 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 28 | csrcid | csrcid | csrcid | varchar2(50) |  |  | '~' |
| 29 | dmakedate | dmakedate | dmakedate | char(19) |
| 30 | economic_type | economic_type | economic_type | varchar2(20) |  |  | '~' |
| 31 | enterprise_introduct | enterprise_introduct | enterprise_introduct | varchar2(3072) |
| 32 | enterprise_level | enterprise_level | enterprise_level | varchar2(50) |
| 33 | enterprise_name | enterprise_name | enterprise_name | varchar2(750) |
| 34 | enterprise_short | enterprise_short | enterprise_short | varchar2(75) |
| 35 | fax_one | fax_one | fax_one | varchar2(50) |
| 36 | fax_three | fax_three | fax_three | varchar2(50) |
| 37 | fax_two | fax_two | fax_two | varchar2(50) |
| 38 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 39 | industry | industry | industry | varchar2(20) |  |  | '~' |
| 40 | internal_enterprise | internal_enterprise | internal_enterprise | char(1) |
| 41 | invest_type | invest_type | invest_type | varchar2(20) |  |  | '~' |
| 42 | legal_behalf | legal_behalf | legal_behalf | varchar2(50) |
| 43 | legal_pid | legal_pid | legal_pid | varchar2(50) |
| 44 | listed | listed | listed | char(1) |
| 45 | mail_one | mail_one | mail_one | varchar2(50) |
| 46 | mail_three | mail_three | mail_three | varchar2(50) |
| 47 | mail_two | mail_two | mail_two | varchar2(50) |
| 48 | nallassessmentmny | nallassessmentmny | nallassessmentmny | number(28, 8) |
| 49 | nalldeclaremny | nalldeclaremny | nalldeclaremny | number(28, 8) |
| 50 | nallpaidcapitalmny | nallpaidcapitalmny | nallpaidcapitalmny | number(28, 8) |
| 51 | nallregistcapitalmny | nallregistcapitalmny | nallregistcapitalmny | number(28, 8) |
| 52 | nallreturninvestmny | nallreturninvestmny | nallreturninvestmny | number(28, 8) |
| 53 | nallreviewmny | nallreviewmny | nallreviewmny | number(28, 8) |
| 54 | nbaseassessmentmny | nbaseassessmentmny | nbaseassessmentmny | number(28, 8) |
| 55 | nbasedeclaremny | nbasedeclaremny | nbasedeclaremny | number(28, 8) |
| 56 | nbasepaidcapitalmny | nbasepaidcapitalmny | nbasepaidcapitalmny | number(28, 8) |
| 57 | nbaseregistcapitalmny | nbaseregistcapitalmny | nbaseregistcapitalmny | number(28, 8) |
| 58 | nbasereturninvestmny | nbasereturninvestmny | nbasereturninvestmny | number(28, 8) |
| 59 | nbasereviewmny | nbasereviewmny | nbasereviewmny | number(28, 8) |
| 60 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 61 | nglobalexchgrate | nglobalexchgrate | nglobalexchgrate | number(28, 8) |
| 62 | ngpassessmentmny | ngpassessmentmny | ngpassessmentmny | number(28, 8) |
| 63 | ngpdeclaremny | ngpdeclaremny | ngpdeclaremny | number(28, 8) |
| 64 | ngppaidcapitalmny | ngppaidcapitalmny | ngppaidcapitalmny | number(28, 8) |
| 65 | ngpregistcapitalmny | ngpregistcapitalmny | ngpregistcapitalmny | number(28, 8) |
| 66 | ngpreturninvestmny | ngpreturninvestmny | ngpreturninvestmny | number(28, 8) |
| 67 | ngpreviewmny | ngpreviewmny | ngpreviewmny | number(28, 8) |
| 68 | ngroupexchgrate | ngroupexchgrate | ngroupexchgrate | number(28, 8) |
| 69 | norigassessmentmny | norigassessmentmny | norigassessmentmny | number(28, 8) |
| 70 | norigdeclaremny | norigdeclaremny | norigdeclaremny | number(28, 8) |
| 71 | norigpaidcapitalmny | norigpaidcapitalmny | norigpaidcapitalmny | number(28, 8) |
| 72 | norigregistcapitalmny | norigregistcapitalmny | norigregistcapitalmny | number(28, 8) |
| 73 | norigreturninvestmny | norigreturninvestmny | norigreturninvestmny | number(28, 8) |
| 74 | norigreviewmny | norigreviewmny | norigreviewmny | number(28, 8) |
| 75 | org_form_code | org_form_code | org_form_code | varchar2(50) |
| 76 | org_institut_code | org_institut_code | org_institut_code | varchar2(50) |
| 77 | phone_one | phone_one | phone_one | varchar2(50) |
| 78 | phone_three | phone_three | phone_three | varchar2(50) |
| 79 | phone_two | phone_two | phone_two | varchar2(50) |
| 80 | pk_afterinveststage | pk_afterinveststage | pk_afterinveststage | varchar2(20) |  |  | '~' |
| 81 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 82 | pk_enterprise_person | pk_enterprise_person | pk_enterprise_person | varchar2(20) |  |  | '~' |
| 83 | pk_group | pk_group | pk_group | char(20) | √ |
| 84 | pk_investmentcategory | pk_investmentcategory | pk_investmentcategory | varchar2(20) |  |  | '~' |
| 85 | pk_logoffcause | pk_logoffcause | pk_logoffcause | varchar2(20) |  |  | '~' |
| 86 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 87 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 88 | pk_orign_version | pk_orign_version | pk_orign_version | char(20) |
| 89 | pk_preinveststage | pk_preinveststage | pk_preinveststage | varchar2(20) |  |  | '~' |
| 90 | pk_projectlib | pk_projectlib | pk_projectlib | varchar2(20) |  |  | '~' |
| 91 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 92 | postal_addr | postal_addr | postal_addr | varchar2(750) |
| 93 | postal_code | postal_code | postal_code | varchar2(50) |
| 94 | property_reg_code | property_reg_code | property_reg_code | varchar2(50) |
| 95 | regist_addr | regist_addr | regist_addr | varchar2(500) |
| 96 | regist_code | regist_code | regist_code | varchar2(50) |
| 97 | regist_date | regist_date | regist_date | char(19) |
| 98 | scope_business | scope_business | scope_business | varchar2(3072) |
| 99 | setup_date | setup_date | setup_date | char(19) |
| 100 | sino_foreign | sino_foreign | sino_foreign | char(1) |
| 101 | social_credit_code | social_credit_code | social_credit_code | varchar2(50) |
| 102 | superior_enterprise | superior_enterprise | superior_enterprise | varchar2(20) |  |  | '~' |
| 103 | taudittime | taudittime | taudittime | char(19) |
| 104 | tax_code | tax_code | tax_code | varchar2(50) |
| 105 | tax_regist_code | tax_regist_code | tax_regist_code | varchar2(50) |
| 106 | vapprovenote | vapprovenote | vapprovenote | varchar2(1024) |
| 107 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 108 | vbillname | vbillname | vbillname | varchar2(1200) |
| 109 | version | version | version | number(38, 0) |
| 110 | version_effect_date | version_effect_date | version_effect_date | char(19) |
| 111 | version_failure_date | version_failure_date | version_failure_date | char(19) |
| 112 | version_name | version_name | version_name | varchar2(50) |
| 113 | version_source | version_source | version_source | varchar2(50) |
| 114 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 115 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 116 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 117 | vmemo | vmemo | vmemo | varchar2(3072) |
| 118 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 119 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 120 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 121 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 122 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 123 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 124 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 125 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 126 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 127 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 128 | vreserve11 | vreserve11 | vreserve11 | varchar2(100) |
| 129 | vreserve12 | vreserve12 | vreserve12 | varchar2(100) |
| 130 | vreserve13 | vreserve13 | vreserve13 | varchar2(100) |
| 131 | vreserve14 | vreserve14 | vreserve14 | varchar2(100) |
| 132 | vreserve15 | vreserve15 | vreserve15 | varchar2(100) |
| 133 | vreserve16 | vreserve16 | vreserve16 | varchar2(100) |
| 134 | vreserve17 | vreserve17 | vreserve17 | varchar2(100) |
| 135 | vreserve18 | vreserve18 | vreserve18 | varchar2(100) |
| 136 | vreserve19 | vreserve19 | vreserve19 | varchar2(100) |
| 137 | vreserve20 | vreserve20 | vreserve20 | varchar2(100) |
| 138 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 139 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 140 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 141 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 142 | web_path | web_path | web_path | varchar2(500) |
| 143 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 144 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 145 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 146 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 147 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 148 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 149 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 150 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 151 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 152 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 153 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 154 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 155 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 156 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 157 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 158 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 159 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 160 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 161 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 162 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 163 | vdef21 | vdef21 | vdef21 | varchar2(101) |
| 164 | vdef22 | vdef22 | vdef22 | varchar2(101) |
| 165 | vdef23 | vdef23 | vdef23 | varchar2(101) |
| 166 | vdef24 | vdef24 | vdef24 | varchar2(101) |
| 167 | vdef25 | vdef25 | vdef25 | varchar2(101) |
| 168 | vdef26 | vdef26 | vdef26 | varchar2(101) |
| 169 | vdef27 | vdef27 | vdef27 | varchar2(101) |
| 170 | vdef28 | vdef28 | vdef28 | varchar2(101) |
| 171 | vdef29 | vdef29 | vdef29 | varchar2(101) |
| 172 | vdef30 | vdef30 | vdef30 | varchar2(101) |
| 173 | vdef31 | vdef31 | vdef31 | varchar2(101) |
| 174 | vdef32 | vdef32 | vdef32 | varchar2(101) |
| 175 | vdef33 | vdef33 | vdef33 | varchar2(101) |
| 176 | vdef34 | vdef34 | vdef34 | varchar2(101) |
| 177 | vdef35 | vdef35 | vdef35 | varchar2(101) |
| 178 | vdef36 | vdef36 | vdef36 | varchar2(101) |
| 179 | vdef37 | vdef37 | vdef37 | varchar2(101) |
| 180 | vdef38 | vdef38 | vdef38 | varchar2(101) |
| 181 | vdef39 | vdef39 | vdef39 | varchar2(101) |
| 182 | vdef40 | vdef40 | vdef40 | varchar2(101) |
| 183 | creationtime | creationtime | creationtime | char(19) |
| 184 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 185 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 186 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 187 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 188 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |