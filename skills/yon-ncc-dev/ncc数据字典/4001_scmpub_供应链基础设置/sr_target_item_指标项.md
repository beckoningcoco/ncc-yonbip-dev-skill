# |<<

**指标项 (sr_target_item / nc.vo.scmf.sr.target.entity.TargetItemBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5484.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_target_item | 指标项子实体 | pk_target_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | citemrowno | 行号 | citemrowno | varchar(20) |  | 字符串 (String) |
| 4 | vtargetname | 指标项名称 | vtargetname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | fitemtypeflag | 指标项类别 | fitemtypeflag | int |  | 指标项类别 (TargetItemType) |  | 0=月指标; |