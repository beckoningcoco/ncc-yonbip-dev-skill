# |<<

**合并报表项目 (ufoc_project / nc.vo.ufoc.unionproject.ProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_project | 项目主键 | pk_project | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(100) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_projectclass | 所属分类 | pk_projectclass | varchar(20) |  | 合并报表项目分类 (ufocprojectclass) |
| 7 | direction | 方向 | direction | int |  | 方向 (enum) |  | 0=借; |