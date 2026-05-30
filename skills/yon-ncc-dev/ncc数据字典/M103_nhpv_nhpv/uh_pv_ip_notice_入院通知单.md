# |<<

**入院通知单 (uh_pv_ip_notice / com.yonyou.yh.nhis.pv.pvipnotice.vo.PVIpNoticeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvipnotice | 入院通知单主键 | pk_pvipnotice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_hp | 医保计划 | pk_hp | varchar(20) |  | 医保计划 (healthplan) |
| 6 | pk_pv_op | 就诊编码_门诊 | pk_pv_op | varchar(20) |  | 字符串 (String) |
| 7 | pk_pv_ip | 就诊编码_住院 | pk_pv_ip | varchar(20) |  | 字符串 (String) |
| 8 | pk_dept_op | 门诊就诊科室 | pk_dept_op | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_phy_op | 门诊医生 | pk_psn_phy_op | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_diag_op_maj | 门诊主要诊断_西医 | pk_diag_op_maj | varchar(20) |  | 标准诊断编码 (stddiag) |
| 11 | desc_diag_op_maj | 门诊主要诊断描述_西医 | desc_diag_op_maj | varchar(256) |  | 字符串 (String) |
| 12 | desc_diag_op_els | 门诊其它诊断描述_西医 | desc_diag_op_els | varchar(256) |  | 字符串 (String) |
| 13 | pk_diag_op_tcm | 门诊主要诊断_中医 | pk_diag_op_tcm | varchar(20) |  | 标准诊断编码 (stddiag) |
| 14 | desc_diag_op_maj_tcm | 门诊主要诊断描述_中医 | desc_diag_op_maj_tcm | varchar(256) |  | 字符串 (String) |
| 15 | desc_diag_op_els_tcm | 门诊其它诊断描述_中医 | desc_diag_op_els_tcm | varchar(256) |  | 字符串 (String) |
| 16 | pk_disestatus | 病情状况 | pk_disestatus | varchar(20) |  | 病情等级(自定义档案) (Defdoc-000202) |
| 17 | dt_disestatus | 病情状况编码 | dt_disestatus | varchar(50) |  | 字符串 (String) |
| 18 | pk_dept_phy_ip | 入院科室 | pk_dept_phy_ip | varchar(20) |  | 组织_部门 (dept) |
| 19 | pk_dept_ns_ip | 入院护理单元 | pk_dept_ns_ip | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_bedtype | 床位类型 | pk_bedtype | varchar(20) |  | 床位类型(自定义档案) (Defdoc-010400) |
| 21 | dt_bedtype | 床位类型编码 | dt_bedtype | varchar(50) |  | 字符串 (String) |
| 22 | date_admit | 计划入院日期 | date_admit | char(19) |  | 日期时间 (UFDateTime) |
| 23 | date_valid | 有效期 | date_valid | char(19) |  | 日期时间 (UFDateTime) |
| 24 | amt_deposit | 预计预交金额度 | amt_deposit | decimal(14, 2) |  | 数值 (UFDouble) |
| 25 | date_notice | 通知单下达日期 | date_notice | char(19) |  | 日期时间 (UFDateTime) |
| 26 | pk_psn_notice | 通知单经办人 | pk_psn_notice | varchar(20) |  | 人员基本信息 (psndoc) |
| 27 | eu_status | 通知单状态 | eu_status | int |  | 通知单状态 (PvIpNoticeStatusEnum) |  | 0=通知单开立; |