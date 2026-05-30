# |<<

**医疗执行_医嘱_物品请领(退)单 (uh_ex_ord_pd / com.yonyou.yh.nhis.pd.ordpdapply.vo.OrdPDApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6099.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordpd | 医疗执行医嘱物品领退主键 | pk_ordpd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_exordtype | 处方/领料单类型主键 | pk_exordtype | varchar(20) |  | 医疗执行_医嘱类型(自定义档案) (Defdoc-120100) |
| 5 | dt_exordtype | 处方/领料单类型编码 | dt_exordtype | varchar(50) |  | 字符串 (String) |
| 6 | code_ex | 处方/领料单执行编码 | code_ex | varchar(30) |  | 字符串 (String) |
| 7 | name_ex | 处方/领料单执行名称 | name_ex | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 9 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 11 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 12 | pk_pres | 处方 | pk_pres | varchar(50) |  | 字符串 (String) |
| 13 | preses | 处方付数 | preses | int |  | 整数 (Integer) |
| 14 | code_pres | 处方/领料单号 | code_pres | varchar(30) |  | 字符串 (String) |
| 15 | pk_org_pres | 处方/领料单开立机构 | pk_org_pres | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 16 | pk_dept_pres | 处方/领料单开立部门 | pk_dept_pres | varchar(20) |  | 组织_部门 (dept) |
| 17 | pk_psn_pres | 处方/领料单开立医生 | pk_psn_pres | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | name_psn_pres | 处方/领料单开立医生名称 | name_psn_pres | varchar(256) |  | 字符串 (String) |
| 19 | date_pres | 处方/领料单开立日期 | date_pres | char(19) |  | 日期时间 (UFDateTime) |
| 20 | flag_ex | 处方/领料单执行标志 | flag_ex | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | pk_org_ex | 处方/领料单执行机构 | pk_org_ex | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 22 | pk_dept_ex | 处方/领料单执行部门 | pk_dept_ex | varchar(20) |  | 组织_部门 (dept) |
| 23 | pk_psn_ex | 处方/领料单执行人员 | pk_psn_ex | varchar(20) |  | 人员基本信息 (psndoc) |
| 24 | date_ex | 处方/领料单执行日期 | date_ex | char(19) |  | 日期时间 (UFDateTime) |
| 25 | name_psn_ex | 处方/领料单执行人员名称 | name_psn_ex | varchar(256) |  | 字符串 (String) |
| 26 | flag_canc | 处方/领料单取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | date_canc | 处方/领料单取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 28 | pk_org_canc | 处方/领料单取消机构 | pk_org_canc | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 29 | pk_dept_canc | 处方/领料单取消部门 | pk_dept_canc | varchar(20) |  | 组织_部门 (dept) |
| 30 | pk_psn_canc | 处方/领料单取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 31 | name_psn_canc | 处方/领料单取消人员名称 | name_psn_canc | varchar(256) |  | 字符串 (String) |
| 32 | flag_boil | 处方/领料单代煎药标志 | flag_boil | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | date_boil | 处方/领料单代煎药日期 | date_boil | char(19) |  | 日期时间 (UFDateTime) |
| 34 | pk_org_boil | 处方/领料单代煎药机构 | pk_org_boil | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 35 | pk_dept_boil | 处方/领料单代煎药部门 | pk_dept_boil | varchar(20) |  | 组织_部门 (dept) |
| 36 | pk_psn_boil | 处方/领料单代煎药人员 | pk_psn_boil | varchar(20) |  | 人员基本信息 (psndoc) |
| 37 | name_psn_boil | 处方/领料单代煎药人员名称 | name_psn_boil | varchar(256) |  | 字符串 (String) |
| 38 | flag_cg | 处方/领料执行单收费标志 | flag_cg | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | eu_status | 处方/领料单状态 | eu_status | int |  | 医疗执行医嘱物品领退状态 (ordpdappstatus) |  | 0=申请; |