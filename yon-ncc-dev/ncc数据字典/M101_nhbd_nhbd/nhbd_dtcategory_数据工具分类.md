# |<<

**数据工具分类 (nhbd_dtcategory / nc.vo.nhbd.datatool.DTCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatool_cate | 分类主键 | pk_datatool_cate | char(20) | √ | 主键 (UFID) |
| 2 | cate_name | 分类名称 | cate_name | varchar(50) |  | 字符串 (String) |
| 3 | cate_code | 分类编码 | cate_code | varchar(50) |  | 字符串 (String) |
| 4 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | modifytime | 修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_father | 上级码 | pk_father | varchar(20) |  | 数据工具分类 (dtcategory) |
| 9 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 10 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |