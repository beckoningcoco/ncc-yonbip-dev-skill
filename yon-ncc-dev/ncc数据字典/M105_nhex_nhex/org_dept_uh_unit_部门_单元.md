# |<<

**部门_单元 (org_dept_uh_unit / com.yonyou.yh.nhis.pd.opdp.vo.OrgDeptUhUnitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_unit | 窗口主键 | pk_unit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_dept | 所属部门 | pk_dept | char(20) |  | 主键 (UFID) |
| 5 | eu_unittype | 单元类型 | eu_unittype | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | code | 窗口编码 | code | varchar(20) |  | 字符串 (String) |
| 7 | name | 窗口名称 | name | varchar(30) |  | 字符串 (String) |
| 8 | flag_online | 在线标志 | flag_online | char(1) |  | 字符串 (String) |
| 9 | cnt | 业务量 | cnt | int |  | 整数 (Integer) |
| 10 | desc_unit | 窗口描述 | desc_unit | varchar(256) |  | 字符串 (String) |
| 11 | eu_butype | 发配药类型 | eu_butype | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |