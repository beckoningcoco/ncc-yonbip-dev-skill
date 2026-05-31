# |<<

**孕产妇健康属性 (bd_uh_peh_preg / com.yonyou.yh.nhis.bd.phdomainewf.vo.PhEWfPregVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1076.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_peh_preg | 主键 | pk_peh_preg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | weekbegin | 适用孕周开始 | weekbegin | int |  | 整数 (Integer) |
| 5 | weekend | 适用孕周结束 | weekend | int |  | 整数 (Integer) |