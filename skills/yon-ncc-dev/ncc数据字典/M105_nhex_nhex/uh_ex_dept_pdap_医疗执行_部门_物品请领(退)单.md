# |<<

**医疗执行_部门_物品请领(退)单 (uh_ex_dept_pdap / com.yonyou.yh.nhis.ex.pd.vo.DeptPdAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6073.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdap | 部门物品请领（退）主键 | pk_deptpdap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_direct | 请退方向 | eu_direct | int |  | 整数 (Integer) |
| 5 | code_ap | 医疗物品请领单编码 | code_ap | varchar(50) |  | 字符串 (String) |
| 6 | name_ap | 医疗物品请领单名称 | name_ap | varchar(50) |  | 字符串 (String) |
| 7 | pk_org_ap | 医疗物品申请机构 | pk_org_ap | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 8 | pk_dept_ap | 医疗物品申请部门 | pk_dept_ap | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_ap | 医疗物品申请人员 | pk_psn_ap | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_ap | 医疗物品申请人员名称 | name_psn_ap | varchar(256) |  | 字符串 (String) |
| 11 | date_ap | 医疗物品申请日期 | date_ap | char(19) |  | 日期时间 (UFDateTime) |
| 12 | flag_de | 医疗物品请领单发放标志 | flag_de | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_org_de | 医疗物品请领单发放机构 | pk_org_de | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 14 | pk_dept_de | 医疗物品请领单发放部门 | pk_dept_de | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_psn_de | 医疗物品请领单发放人员 | pk_psn_de | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | name_psn_de | 医疗物品请领单发放人员名称 | name_psn_de | varchar(256) |  | 字符串 (String) |
| 17 | date_de | 医疗物品请领单发放日期 | date_de | char(19) |  | 日期时间 (UFDateTime) |
| 18 | flag_canc | 医疗物品执行单取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_org_canc | 医疗物品执行单取消机构 | pk_org_canc | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 20 | pk_dept_canc | 医疗物品执行单取消部门 | pk_dept_canc | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_psn_canc | 医疗物品执行单取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | name_psn_canc | 医疗物品执行单取消人员名称 | name_psn_canc | varchar(256) |  | 字符串 (String) |
| 23 | date_canc | 医疗物品执行单取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 24 | flag_fin | 申请单完成标志 | flag_fin | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | eu_status | 状态 | eu_status | int |  | 整数 (Integer) |
| 26 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 27 | dt_pdaptype | 医疗物品部门请领类型 | dt_pdaptype | varchar(20) |  | 字符串 (String) |
| 28 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 29 | dt_exdepttype | 部门医疗执行类型编码 | dt_exdepttype | varchar(50) |  | 字符串 (String) |
| 30 | pk_exdepttype | 部门医疗执行类型 | pk_exdepttype | varchar(20) |  | 医疗执行_部门类型(自定义档案) (Defdoc-120200) |
| 31 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 32 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 33 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 35 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |