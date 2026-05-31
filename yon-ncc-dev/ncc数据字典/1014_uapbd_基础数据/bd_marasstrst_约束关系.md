# |<<

**约束关系 (bd_marasstrst / nc.vo.bd.material.marasstrst.MarAsstrstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/879.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marasstrst | 约束关系主键 | pk_marasstrst | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_集团 (group) |
| 4 | pk_marasstframe | 所属辅助属性结构 | pk_marasstframe | char(20) | √ | 辅助属性结构 (marasstframe) |
| 5 | code | 约束关系编码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | name | 约束关系名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | pk_marassistant | 控制属性 | pk_marassistant | char(20) | √ | 辅助属性 (marassistant) |
| 8 | pk_marassistant_ctrl | 受控属性 | pk_marassistant_ctrl | char(20) | √ | 辅助属性 (marassistant) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |