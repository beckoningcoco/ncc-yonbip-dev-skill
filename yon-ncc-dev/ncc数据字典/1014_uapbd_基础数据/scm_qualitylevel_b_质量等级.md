# |<<

**质量等级 (scm_qualitylevel_b / nc.vo.scmf.qc.qualitylevel.entity.QualityLevelItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5225.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qualitylv_b | 质量等级 | pk_qualitylv_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cqualitylvcode | 质量等级编码 | cqualitylvcode | varchar(4) | √ | 字符串 (String) |
| 4 | cqualitylvname | 质量等级名称 | cqualitylvname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | bqualified | 是否合格品 | bqualified | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 6 | cdefectprocess | 建议处理方式 | cdefectprocess | varchar(20) |  | 处理方式 (scm_dealfashion) |
| 7 | cbatchsuffix | 批次后缀 | cbatchsuffix | varchar(10) |  | 字符串 (String) |
| 8 | pk_stockstate | 库存状态 | pk_stockstate | varchar(20) |  | 库存状态 (ic_storestate) |
| 9 | bfeaturequalified | 特征合格品 | bfeaturequalified | char(1) |  | 布尔类型 (UFBoolean) |