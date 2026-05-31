# |<<

**医疗执行事件 (uh_exet / com.yonyou.yh.nhis.ex.et.vo.MedExEventVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exet | 医疗执行事件主键 | pk_exet | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_exettype | 医疗执行事件类型 | pk_exettype | varchar(20) |  | 医疗执行事件类型(自定义档案) (Defdoc-120000) |
| 5 | dt_exettype | 医疗执行事件类型编码 | dt_exettype | varchar(50) |  | 字符串 (String) |
| 6 | code_et | 事件编码 | code_et | varchar(30) |  | 字符串 (String) |
| 7 | name_ex | 事件名称 | name_ex | varchar(50) |  | 字符串 (String) |
| 8 | pk_org_et | 事件机构 | pk_org_et | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 9 | pk_dept_et | 事件部门 | pk_dept_et | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_psn_et | 事件人员 | pk_psn_et | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | name_psn_et | 事件人员名称 | name_psn_et | varchar(50) |  | 字符串 (String) |
| 12 | date_et | 事件日期 | date_et | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_ex_dept_pdap | 医疗执行_部门_物品 | pk_ex_dept_pdap | varchar(20) |  | 医疗执行_部门_物品请领(退)单 (deptpdapp) |
| 14 | pk_ex_ord_pd | 医疗执行_医嘱_物品 | pk_ex_ord_pd | varchar(20) |  | 医疗执行_医嘱_物品请领(退)单 (ordpdapply) |
| 15 | status_dept_mt | 医疗执行_部门_医技_执行状态 | status_dept_mt | int |  | 医疗执行部门医技状态 (deptmtappstatus) |  | 0=申请; |