# |<<

**计量单位 (bd_measdoc / nc.vo.bd.material.measdoc.MeasdocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measdoc | 计量单位主键 | pk_measdoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 计量单位编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 计量单位名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | oppdimen | 所属量纲 | oppdimen | char(1) | √ | 量纲 (oppdimen) |  | W=重量; |