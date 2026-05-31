# |<<

**数据工具 (nhbd_datatool / nc.vo.nhbd.datatool.DataToolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatool | 主键 | pk_datatool | char(20) | √ | 主键 (UFID) |
| 2 | pk_datatool_cate | 分类主键 | pk_datatool_cate | varchar(50) |  | 字符串 (String) |
| 3 | datatool_code | 编码 | datatool_code | varchar(50) |  | 字符串 (String) |
| 4 | datatool_name | 名称 | datatool_name | varchar(50) |  | 字符串 (String) |
| 5 | sql_template | 语义模型 | sql_template | varchar(200) |  | 备注 (Memo) |
| 6 | version | 版本 | version | int |  | 整数 (Integer) |
| 7 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifytime | 修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | usecount | 使用次数 | usecount | int |  | 整数 (Integer) |
| 10 | active | 启用状态 | active | int |  | 整数 (Integer) |
| 11 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | datatool_type | 维护类型 | datatool_type | int |  | 维护类型 (changemodeEnum) |  | 1=修改; |