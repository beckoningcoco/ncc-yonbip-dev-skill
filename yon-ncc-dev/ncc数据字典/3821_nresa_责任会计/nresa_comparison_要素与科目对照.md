# |<<

**要素与科目对照 (nresa_comparison / nccloud.vo.nresa.upgrade.ComparisonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor_subjects | 主键 | pk_factor_subjects | char(20) | √ | 主键 (UFID) |
| 2 | pk_controlarea | 管控范围 | pk_controlarea | char(20) | √ | 管控范围 (controlarea) |
| 3 | pk_factorchart | 要素表 | pk_factorchart | char(20) | √ | 要素表 (FactorChart) |
| 4 | factor_version | 要素表版本 | factor_version | varchar(20) | √ | 字符串 (String) |
| 5 | pk_factorasoa | 核算要素 | pk_factorasoa | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | factorasoa_accassitem | 要素辅助核算 | factorasoa_accassitem | varchar(200) |  | 字符串 (String) |
| 7 | pk_accchart | 科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 8 | accchart_version | 科目表版本 | accchart_version | varchar(20) | √ | 字符串 (String) |
| 9 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 10 | accasoa_auxiliary | 科目辅助核算 | accasoa_auxiliary | varchar(200) |  | 字符串 (String) |
| 11 | check_status | 检查结果 | check_status | int | √ | 检查结果 (CheckEnum) | 1 | 1=未检查; |