# |<<

**要素组内要素 (resa_factorsingroup / nc.vo.resa.factor.FactorsInGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factoringroup | ID标识 | pk_factoringroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_factorasoa | 关联要素 | pk_factorasoa | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 3 | pk_factorchart | 要素表版本 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |