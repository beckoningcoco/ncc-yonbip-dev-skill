# |<<

**转换映射内容 (fip_docmap_b / nc.vo.fip.docmap.DocMapBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2234.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmap_b | 对象标识 | pk_docmap_b | char(20) | √ | 主键 (UFID) |
| 2 | docentity | 需要转换的档案实体 | docentity | varchar(36) |  | 实体 (entity) |
| 3 | src_code | 来源编码规则 | src_code | varchar(500) |  | 字符串 (String) |
| 4 | des_code | 目标编码规则 | des_code | varchar(500) |  | 字符串 (String) |