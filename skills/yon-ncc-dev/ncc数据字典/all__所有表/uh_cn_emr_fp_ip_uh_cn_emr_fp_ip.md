# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12476.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrfp | pk_emrfp | pk_emrfp | char(20) | √ |
| 2 | addr_birth_city | addr_birth_city | addr_birth_city | varchar2(50) |
| 3 | addr_birth_county | addr_birth_county | addr_birth_county | varchar2(100) |
| 4 | addr_birth_prov | addr_birth_prov | addr_birth_prov | varchar2(50) |
| 5 | addr_ct | addr_ct | addr_ct | varchar2(256) |
| 6 | addr_regi_city | addr_regi_city | addr_regi_city | varchar2(1000) |
| 7 | addr_regi_county | addr_regi_county | addr_regi_county | varchar2(1000) |
| 8 | addr_regi_postcode | addr_regi_postcode | addr_regi_postcode | varchar2(30) |
| 9 | addr_regi_prov | addr_regi_prov | addr_regi_prov | varchar2(1000) |
| 10 | addr_resi_city | addr_resi_city | addr_resi_city | varchar2(1000) |
| 11 | addr_resi_county | addr_resi_county | addr_resi_county | varchar2(1000) |
| 12 | addr_resi_phone | addr_resi_phone | addr_resi_phone | varchar2(50) |
| 13 | addr_resi_postcode | addr_resi_postcode | addr_resi_postcode | varchar2(30) |
| 14 | addr_resi_prov | addr_resi_prov | addr_resi_prov | varchar2(1000) |
| 15 | age_day | age_day | age_day | number(38, 0) |
| 16 | age_month | age_month | age_month | number(38, 0) |
| 17 | age_year | age_year | age_year | number(38, 0) |
| 18 | ciphertext | ciphertext | ciphertext | varchar2(2000) |
| 19 | code_cttype | code_cttype | code_cttype | varchar2(50) |
| 20 | code_diag_op | code_diag_op | code_diag_op | varchar2(30) |
| 21 | code_diag_path | code_diag_path | code_diag_path | varchar2(30) |
| 22 | code_fp | code_fp | code_fp | varchar2(50) |
| 23 | code_harm_pois | code_harm_pois | code_harm_pois | varchar2(30) |
| 24 | code_org | code_org | code_org | varchar2(30) |
| 25 | code_org_recv | code_org_recv | code_org_recv | varchar2(30) |
| 26 | code_path | code_path | code_path | varchar2(100) |
| 27 | coma_after | coma_after | coma_after | varchar2(50) |
| 28 | coma_before | coma_before | coma_before | varchar2(50) |
| 29 | date_adm | date_adm | date_adm | char(19) |
| 30 | date_archive | date_archive | date_archive | char(19) |
| 31 | date_audit | date_audit | date_audit | char(19) |
| 32 | date_birth | date_birth | date_birth | char(19) |
| 33 | date_disc | date_disc | date_disc | char(19) |
| 34 | date_qa | date_qa | date_qa | char(19) |
| 35 | date_sign | date_sign | date_sign | char(19) |
| 36 | date_upload | date_upload | date_upload | char(19) |
| 37 | days_ip | days_ip | days_ip | number(38, 0) |
| 38 | desc_diag_op | desc_diag_op | desc_diag_op | varchar2(256) |
| 39 | desc_diag_path | desc_diag_path | desc_diag_path | varchar2(256) |
| 40 | desc_redisc | desc_redisc | desc_redisc | varchar2(256) |
| 41 | disease_classification | disease_classification | disease_classification | char(19) |
| 42 | dt_blood_abo | dt_blood_abo | dt_blood_abo | varchar2(20) |
| 43 | dt_blood_rh | dt_blood_rh | dt_blood_rh | varchar2(20) |
| 44 | dt_cttype | dt_cttype | dt_cttype | varchar2(20) |
| 45 | dt_emrlevel | dt_emrlevel | dt_emrlevel | varchar2(20) |
| 46 | dt_idtype | dt_idtype | dt_idtype | varchar2(20) |
| 47 | dt_mari | dt_mari | dt_mari | varchar2(20) |
| 48 | dt_nation | dt_nation | dt_nation | varchar2(20) |
| 49 | dt_occu | dt_occu | dt_occu | varchar2(20) |
| 50 | dt_paymethod | dt_paymethod | dt_paymethod | number(38, 0) |
| 51 | dt_pv_ip_discmode | dt_pv_ip_discmode | dt_pv_ip_discmode | varchar2(20) |
| 52 | dt_pv_ip_refmode | dt_pv_ip_refmode | dt_pv_ip_refmode | varchar2(20) |
| 53 | dt_region_birth | dt_region_birth | dt_region_birth | varchar2(20) |
| 54 | dt_region_origin | dt_region_origin | dt_region_origin | varchar2(30) |
| 55 | dt_region_regi | dt_region_regi | dt_region_regi | varchar2(30) |
| 56 | dt_region_resi | dt_region_resi | dt_region_resi | varchar2(30) |
| 57 | dt_sex | dt_sex | dt_sex | varchar2(20) |
| 58 | eu_cpmode | eu_cpmode | eu_cpmode | varchar2(20) |
| 59 | eu_emrfptype | eu_emrfptype | eu_emrfptype | number(38, 0) |
| 60 | flag_allergy | flag_allergy | flag_allergy | char(19) |
| 61 | flag_archive | flag_archive | flag_archive | char(1) |  |  | 'N' |
| 62 | flag_audit | flag_audit | flag_audit | char(1) |  |  | 'N' |
| 63 | flag_autopsy | flag_autopsy | flag_autopsy | char(19) |
| 64 | flag_redisc | flag_redisc | flag_redisc | varchar2(2) |
| 65 | heal_card_no | heal_card_no | heal_card_no | varchar2(50) |
| 66 | hour_breath | hour_breath | hour_breath | number(38, 0) |
| 67 | idno | idno | idno | varchar2(30) |
| 68 | inhos_count | inhos_count | inhos_count | number(38, 0) |
| 69 | medi_allergy | medi_allergy | medi_allergy | varchar2(256) |
| 70 | mphone_ct | mphone_ct | mphone_ct | varchar2(30) |
| 71 | name_blood_rh | name_blood_rh | name_blood_rh | varchar2(50) |
| 72 | name_cpmode | name_cpmode | name_cpmode | varchar2(50) |
| 73 | name_ct | name_ct | name_ct | varchar2(50) |
| 74 | name_dept_phy_adm | name_dept_phy_adm | name_dept_phy_adm | varchar2(50) |
| 75 | name_dept_phy_disc | name_dept_phy_disc | name_dept_phy_disc | varchar2(50) |
| 76 | name_dept_trans | name_dept_trans | name_dept_trans | varchar2(256) |
| 77 | name_dept_ward_adm | name_dept_ward_adm | name_dept_ward_adm | varchar2(50) |
| 78 | name_dept_ward_disc | name_dept_ward_disc | name_dept_ward_disc | varchar2(50) |
| 79 | name_diag_op | name_diag_op | name_diag_op | varchar2(50) |
| 80 | name_diag_path | name_diag_path | name_diag_path | varchar2(1000) |
| 81 | name_emrlevel | name_emrlevel | name_emrlevel | varchar2(50) |
| 82 | name_harm_pois | name_harm_pois | name_harm_pois | varchar2(80) |
| 83 | name_mari | name_mari | name_mari | varchar2(50) |
| 84 | name_nation | name_nation | name_nation | varchar2(50) |
| 85 | name_occu | name_occu | name_occu | varchar2(50) |
| 86 | name_org | name_org | name_org | varchar2(50) |
| 87 | name_org_recv | name_org_recv | name_org_recv | varchar2(50) |
| 88 | name_psn_accept | name_psn_accept | name_psn_accept | varchar2(50) |
| 89 | name_psn_attend | name_psn_attend | name_psn_attend | varchar2(50) |
| 90 | name_psn_coding | name_psn_coding | name_psn_coding | varchar2(50) |
| 91 | name_psn_director | name_psn_director | name_psn_director | varchar2(50) |
| 92 | name_psn_expert | name_psn_expert | name_psn_expert | varchar2(50) |
| 93 | name_psn_intern | name_psn_intern | name_psn_intern | varchar2(50) |
| 94 | name_psn_ip | name_psn_ip | name_psn_ip | varchar2(50) |
| 95 | name_psn_nurse | name_psn_nurse | name_psn_nurse | varchar2(50) |
| 96 | name_psn_nurse_qa | name_psn_nurse_qa | name_psn_nurse_qa | varchar2(50) |
| 97 | name_psn_phy_qa | name_psn_phy_qa | name_psn_phy_qa | varchar2(50) |
| 98 | name_psn_refresh | name_psn_refresh | name_psn_refresh | varchar2(50) |
| 99 | name_psn_sign | name_psn_sign | name_psn_sign | varchar2(50) |
| 100 | name_pv_ip_discmode | name_pv_ip_discmode | name_pv_ip_discmode | varchar2(50) |
| 101 | name_pv_ip_refmode | name_pv_ip_refmode | name_pv_ip_refmode | varchar2(50) |
| 102 | name_sex | name_sex | name_sex | varchar2(50) |
| 103 | nane_blood_abo | nane_blood_abo | nane_blood_abo | varchar2(50) |
| 104 | nation | nation | nation | varchar2(50) |
| 105 | note | note | note | varchar2(256) |
| 106 | orginaltext | orginaltext | orginaltext | blob |
| 107 | origin_city | origin_city | origin_city | varchar2(50) |
| 108 | origin_county | origin_county | origin_county | varchar2(50) |
| 109 | origin_prov | origin_prov | origin_prov | varchar2(50) |
| 110 | outcomes | outcomes | outcomes | varchar2(20) |
| 111 | paticode | paticode | paticode | varchar2(30) |
| 112 | patiname | patiname | patiname | varchar2(50) |
| 113 | phone_ct | phone_ct | phone_ct | varchar2(30) |
| 114 | pk_addr_birth_city | pk_addr_birth_city | pk_addr_birth_city | char(20) |
| 115 | pk_addr_birth_prov | pk_addr_birth_prov | pk_addr_birth_prov | char(20) |
| 116 | pk_addr_regi_city | pk_addr_regi_city | pk_addr_regi_city | char(20) |
| 117 | pk_addr_regi_prov | pk_addr_regi_prov | pk_addr_regi_prov | char(20) |
| 118 | pk_addr_resi_city | pk_addr_resi_city | pk_addr_resi_city | char(20) |
| 119 | pk_addr_resi_prov | pk_addr_resi_prov | pk_addr_resi_prov | char(20) |
| 120 | pk_dept_phy_adm | pk_dept_phy_adm | pk_dept_phy_adm | char(20) |
| 121 | pk_dept_phy_disc | pk_dept_phy_disc | pk_dept_phy_disc | char(20) |
| 122 | pk_dept_ward_adm | pk_dept_ward_adm | pk_dept_ward_adm | char(20) |
| 123 | pk_dept_ward_disc | pk_dept_ward_disc | pk_dept_ward_disc | char(20) |
| 124 | pk_diag_harm_pois | pk_diag_harm_pois | pk_diag_harm_pois | char(20) |
| 125 | pk_diag_op | pk_diag_op | pk_diag_op | char(20) |
| 126 | pk_diag_path | pk_diag_path | pk_diag_path | char(1000) |
| 127 | pk_group | pk_group | pk_group | char(20) |
| 128 | pk_org | pk_org | pk_org | char(20) |
| 129 | pk_org_recv | pk_org_recv | pk_org_recv | char(400) |
| 130 | pk_origin_city | pk_origin_city | pk_origin_city | char(20) |
| 131 | pk_origin_prov | pk_origin_prov | pk_origin_prov | char(20) |
| 132 | pk_pati | pk_pati | pk_pati | char(20) |
| 133 | pk_psn_accept | pk_psn_accept | pk_psn_accept | char(20) |
| 134 | pk_psn_archive | pk_psn_archive | pk_psn_archive | char(20) |
| 135 | pk_psn_attend | pk_psn_attend | pk_psn_attend | char(20) |
| 136 | pk_psn_audit | pk_psn_audit | pk_psn_audit | char(20) |
| 137 | pk_psn_coding | pk_psn_coding | pk_psn_coding | char(20) |
| 138 | pk_psn_director | pk_psn_director | pk_psn_director | char(20) |
| 139 | pk_psn_expert | pk_psn_expert | pk_psn_expert | char(20) |
| 140 | pk_psn_ip | pk_psn_ip | pk_psn_ip | char(20) |
| 141 | pk_psn_nurse | pk_psn_nurse | pk_psn_nurse | char(20) |
| 142 | pk_psn_nurse_qa | pk_psn_nurse_qa | pk_psn_nurse_qa | char(20) |
| 143 | pk_psn_phy_qa | pk_psn_phy_qa | pk_psn_phy_qa | char(20) |
| 144 | pk_psn_sign | pk_psn_sign | pk_psn_sign | varchar2(20) |
| 145 | pk_pv | pk_pv | pk_pv | char(20) |
| 146 | publickey | publickey | publickey | blob |
| 147 | reason_harm_pois | reason_harm_pois | reason_harm_pois | varchar2(256) |
| 148 | unit_work | unit_work | unit_work | varchar2(256) |
| 149 | unit_work_phone | unit_work_phone | unit_work_phone | varchar2(50) |
| 150 | unit_work_postcode | unit_work_postcode | unit_work_postcode | varchar2(30) |
| 151 | weight_nb_admit | weight_nb_admit | weight_nb_admit | number(14, 2) |
| 152 | weight_nb_birth | weight_nb_birth | weight_nb_birth | number(14, 2) |
| 153 | def1 | def1 | def1 | varchar2(256) |
| 154 | def2 | def2 | def2 | varchar2(256) |
| 155 | def3 | def3 | def3 | varchar2(256) |
| 156 | def4 | def4 | def4 | varchar2(256) |
| 157 | def5 | def5 | def5 | varchar2(256) |
| 158 | def6 | def6 | def6 | varchar2(256) |
| 159 | def7 | def7 | def7 | varchar2(256) |
| 160 | def8 | def8 | def8 | varchar2(256) |
| 161 | def9 | def9 | def9 | varchar2(256) |
| 162 | def10 | def10 | def10 | varchar2(256) |
| 163 | dr | dr | dr | number(10, 0) |
| 164 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |