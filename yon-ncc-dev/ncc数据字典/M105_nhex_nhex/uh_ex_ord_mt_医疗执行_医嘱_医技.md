# |<<

**医疗执行_医嘱_医技 (uh_ex_ord_mt / com.yonyou.yh.nhis.ex.mt.vo.OrdMTApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordmt | 医疗执行医嘱医技主键 | pk_ordmt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_exordtype | 医疗医嘱执行类型 | pk_exordtype | varchar(20) |  | 医疗执行_医嘱类型(自定义档案) (Defdoc-120100) |
| 5 | dt_exordtype | 医疗医嘱执行类型编码 | dt_exordtype | varchar(50) |  | 字符串 (String) |
| 6 | code_ex | 医疗执行编码 | code_ex | varchar(50) |  | 字符串 (String) |
| 7 | name_ex | 医疗执行名称 | name_ex | varchar(50) |  | 字符串 (String) |
| 8 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 9 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 11 | pk_pv | 就诊 | pk_pv | varchar(50) |  | 字符串 (String) |
| 12 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 13 | code_apply | 申请单号 | code_apply | varchar(50) |  | 字符串 (String) |
| 14 | pk_org_ord | 医嘱开立机构 | pk_org_ord | varchar(50) |  | 字符串 (String) |
| 15 | pk_dept_ord | 医嘱开立部门 | pk_dept_ord | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_psn_ord | 医嘱开立医生 | pk_psn_ord | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | name_psn_ord | 医嘱开立医生名称 | name_psn_ord | varchar(50) |  | 字符串 (String) |
| 18 | date_ord | 医嘱开立日期 | date_ord | char(19) |  | 日期时间 (UFDateTime) |
| 19 | date_entry | 录入日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 20 | date_plan | 计划日期 | date_plan | char(19) |  | 日期时间 (UFDateTime) |
| 21 | date_appt | 预约日期 | date_appt | char(19) |  | 日期时间 (UFDateTime) |
| 22 | flag_ex | 医嘱执行登记标志 | flag_ex | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | pk_org_ex | 医嘱执行登记机构 | pk_org_ex | varchar(50) |  | 字符串 (String) |
| 24 | pk_dept_ex | 医嘱执行登记部门 | pk_dept_ex | varchar(20) |  | 组织_部门 (dept) |
| 25 | pk_psn_ex | 医嘱执行登记人员 | pk_psn_ex | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | name_psn_ex | 医嘱执行登记人员名称 | name_psn_ex | varchar(50) |  | 字符串 (String) |
| 27 | date_ex | 医嘱执行登记日期 | date_ex | char(19) |  | 日期时间 (UFDateTime) |
| 28 | flag_ret | 结果返回/报告返回/记录返回标志 | flag_ret | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | pk_psn_rec | 结果/报告记录人员 | pk_psn_rec | varchar(20) |  | 人员基本信息 (psndoc) |
| 30 | name_psn_rec | 结果/报告记录人员名称 | name_psn_rec | varchar(50) |  | 字符串 (String) |
| 31 | pk_psn_chk | 结果/报告审核人员 | pk_psn_chk | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | name_psn_chk | 结果/报告审核人员名称 | name_psn_chk | varchar(50) |  | 字符串 (String) |
| 33 | date_ret | 结果返回/报告返回/记录返回日期 | date_ret | char(19) |  | 日期时间 (UFDateTime) |
| 34 | flag_canc | 医嘱执行取消标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | date_canc | 医嘱执行取消日期 | date_canc | char(19) |  | 日期时间 (UFDateTime) |
| 36 | pk_org_canc | 医嘱执行取消机构 | pk_org_canc | varchar(50) |  | 字符串 (String) |
| 37 | pk_dept_canc | 医嘱执行取消部门 | pk_dept_canc | varchar(20) |  | 组织_部门 (dept) |
| 38 | pk_psn_canc | 医嘱执行取消人员 | pk_psn_canc | varchar(20) |  | 人员基本信息 (psndoc) |
| 39 | name_psn_canc | 医嘱执行取消人员名称 | name_psn_canc | varchar(50) |  | 字符串 (String) |
| 40 | flag_cg | 医嘱记费标志 | flag_cg | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | pk_cg | 对应记费 | pk_cg | varchar(50) |  | 字符串 (String) |
| 42 | eu_status | 申请单状态 | eu_status | int |  | 医疗执行医嘱医技状态 (ordmtappstatus) |  | 0=生成; |