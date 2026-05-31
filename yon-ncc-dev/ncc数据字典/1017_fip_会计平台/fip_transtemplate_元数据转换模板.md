# |<<

**元数据转换模板 (fip_transtemplate / nc.vo.fip.transtemplate.TransTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2259.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtemplate | 对象标识 | pk_transtemplate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 5 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 6 | generatemode | 生成方式 | generatemode | int |  | 生成方式 (generatemode) |  | 0=立即处理; |