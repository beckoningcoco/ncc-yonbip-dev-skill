# |<<

**医疗服务执行科室 (bd_uh_srv_dept / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1112.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvdept | 服务执行科室主键 | pk_srvdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_srvorg | 机构医疗服务 | pk_srvorg | char(20) |  | 主键 (UFID) |
| 5 | pk_org_ex | 执行机构 | pk_org_ex | char(20) |  | 主键 (UFID) |
| 6 | pk_dept_ex | 执行科室 | pk_dept_ex | char(20) |  | 主键 (UFID) |
| 7 | flag_def | 默认标志 | flag_def | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |