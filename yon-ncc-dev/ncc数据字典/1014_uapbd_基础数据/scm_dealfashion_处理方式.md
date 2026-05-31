# |<<

**处理方式 (scm_dealfashion / nc.vo.scmf.qc.dealfashion.entity.DealFashionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dealfashion | 处理方式主键 | pk_dealfashion | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cdealfashcode | 处理方式编码 | cdealfashcode | varchar(4) |  | 字符串 (String) |
| 4 | cdealfashname | 处理方式名称 | cdealfashname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 备注 (Memo) |