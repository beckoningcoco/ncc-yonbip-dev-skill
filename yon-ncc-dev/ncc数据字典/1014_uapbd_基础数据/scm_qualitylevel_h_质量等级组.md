# |<<

**质量等级组 (scm_qualitylevel_h / nc.vo.scmf.qc.qualitylevel.entity.QualityLevelHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5226.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qualitylv | 质量等级组 | pk_qualitylv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cqlgroupcode | 质量等级组编码 | cqlgroupcode | varchar(4) |  | 字符串 (String) |
| 4 | cqlgroupname | 质量等级组名称 | cqlgroupname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |