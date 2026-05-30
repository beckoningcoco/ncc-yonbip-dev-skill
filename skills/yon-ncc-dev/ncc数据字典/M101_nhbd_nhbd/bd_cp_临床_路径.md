# |<<

**临床_路径 (bd_cp / com.yonyou.yh.nhis.bd.cp.vo.BdCPathVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cp | 临床路径主键 | pk_cp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cptype | 路径类型 | pk_cptype | varchar(20) |  | 路径类型(自定义档案) (Defdoc-060401) |
| 5 | dt_cptype | 路径类型码值 | dt_cptype | varchar(50) |  | 字符串 (String) |
| 6 | cpcode | 路径编码 | cpcode | varchar(50) |  | 字符串 (String) |
| 7 | cpname | 路径名称 | cpname | varchar(50) |  | 字符串 (String) |
| 8 | cpdes | 路径描述 | cpdes | varchar(256) |  | 字符串 (String) |
| 9 | pk_dept | 临床科室编码 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_org_v | 所属组织机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |