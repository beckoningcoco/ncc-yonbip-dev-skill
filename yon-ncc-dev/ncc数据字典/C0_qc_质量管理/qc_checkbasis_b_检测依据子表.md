# |<<

**检测依据子表 (qc_checkbasis_b / nc.vo.qc.checkbasis.entity.BasisItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkbasis_b | 检测依据子表主键 | pk_checkbasis_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vcheckmethod | 检测方法 | vcheckmethod | varchar(181) |  | 字符串 (String) |
| 4 | bdefault | 默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | vmemob | 备注 | vmemob | varchar(181) |  | 字符串 (String) |