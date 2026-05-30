# |<<

**传染病字典 (uh_bd_infect / com.yonyou.yh.nhis.bd.infect.vo.InfectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect | 传染病字典主键 | pk_infect | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | infect_type | 传染病分类 | infect_type | varchar(50) | √ | 传染病分类 (InfectTypeEnum) |  | 1=甲类; |