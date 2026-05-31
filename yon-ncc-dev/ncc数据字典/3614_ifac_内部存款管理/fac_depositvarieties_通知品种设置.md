# |<<

**通知品种设置 (fac_depositvarieties / nc.vo.fac.noticevarieties.NoticeVarietiesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2087.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_varieties | 主键 | pk_varieties | char(20) | √ | 主键 (UFID) |
| 2 | varcode | 品种编号 | varcode | varchar(50) |  | 字符串 (String) |
| 3 | varproperty | 通知业务品种属性 | varproperty | varchar(50) |  | 业务品种属性 (VarietiesPropertyEnum) |  | DEPOSIT=常规; |