# |<<

**管控范围 (resa_controlarea / nc.vo.resa.controlarea.ControlAreaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4889.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_controlarea | 管控范围主键 | pk_controlarea | char(20) | √ | 主键 (UFID) |
| 2 | cacode | 编码 | cacode | varchar(40) |  | 字符串 (String) |
| 3 | caname | 名称 | caname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_setofbook | 账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 6 | pk_factorchart | 关联要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 7 | expla | 说明 | expla | varchar(200) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |