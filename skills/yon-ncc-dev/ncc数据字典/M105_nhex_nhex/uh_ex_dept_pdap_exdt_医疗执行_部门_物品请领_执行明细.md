# |<<

**医疗执行_部门_物品请领_执行明细 (uh_ex_dept_pdap_exdt / com.yonyou.yh.nhis.ex.pd.vo.DeptPdapExdtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6075.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptpdexdt | 部门物品请领执行明细主键 | pk_deptpdexdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_deptpdapdt | 部门物品请领(退)明细主键 | pk_deptpdapdt | varchar(20) |  | 医疗执行_部门_物品请领(退)单 (deptpdapp) |
| 5 | date_exec | 计划执行日期时间 | date_exec | char(19) |  | 日期时间 (UFDateTime) |
| 6 | quan_md | 数值_医学单位 | quan_md | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | pk_measdoc_med | 服务医学单位 | pk_measdoc_med | varchar(20) |  | 计量单位 (measdoc) |
| 8 | pk_measdoc_cur | 物品包装单位_当前 | pk_measdoc_cur | varchar(20) |  | 计量单位 (measdoc) |
| 9 | quan_cur | 请领数量_当前 | quan_cur | decimal(14, 2) |  | 数值 (UFDouble) |
| 10 | flag_prt | 打印标志 | flag_prt | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | flag_de | 医疗物品请领单发放标志 | flag_de | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_deptpddedt | 部门物品发放明细主键 | pk_deptpddedt | varchar(20) |  | 字符串 (String) |
| 13 | pk_pdpivas | 静配管理主键 | pk_pdpivas | char(20) |  | 主键 (UFID) |
| 14 | quan_med | 药品用量 | quan_med | int |  | 整数 (Integer) |
| 15 | quan_round | quan_round | quan_round | int |  | 整数 (Integer) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |