# |<<

**启用日折旧组织 (fa_usedaydeporg / nc.vo.fa.usedaydeporg.UsedaydeporgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usedaydeporg | 主键 | pk_usedaydeporg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | org_code | 组织编码 | org_code | varchar(50) |  | 字符串 (String) |