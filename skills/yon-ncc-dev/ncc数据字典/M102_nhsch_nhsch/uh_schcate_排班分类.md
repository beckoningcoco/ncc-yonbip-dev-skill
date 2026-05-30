# |<<

**排班分类 (uh_schcate / com.yonyou.yh.nhis.sch.schcate.vo.SchcateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6279.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schcate | 排班分类主键 | pk_schcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | eu_schcatetype | 排班分类种类 | eu_schcatetype | int |  | 排班分类种类 (schcatetype) |  | 0=业务排班; |