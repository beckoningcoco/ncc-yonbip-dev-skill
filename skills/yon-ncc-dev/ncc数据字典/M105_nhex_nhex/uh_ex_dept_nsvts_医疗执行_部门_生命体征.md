# |<<

**医疗执行_部门_生命体征 (uh_ex_dept_nsvts / com.yonyou.yh.nhis.ex.mt.vo.DeptMTAppVSignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nsvts | 生理体征主键 | pk_nsvts | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_deptmt | 医疗执行部门医技 | pk_deptmt | varchar(20) |  | 医疗执行_部门_医技 (deptmtapply) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_pv | 就诊编码 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 9 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 10 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 11 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 12 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 13 | desc_ord | 医嘱内容 | desc_ord | varchar(256) |  | 字符串 (String) |
| 14 | pk_ordsrv | 医嘱服务 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 15 | pk_srv | 生理特征 | pk_srv | varchar(50) |  | 字符串 (String) |
| 16 | code_srv | 生理体征编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 17 | date_coll | 计划测量时间 | date_coll | char(19) |  | 日期时间 (UFDateTime) |
| 18 | pk_psn_coll | 计划测量人员 | pk_psn_coll | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | name_psn_coll | 计划测量人员名称 | name_psn_coll | varchar(50) |  | 字符串 (String) |
| 20 | note | 备注 | note | varchar(400) |  | 字符串 (String) |