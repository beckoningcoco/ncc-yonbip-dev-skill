# |<<

**来源收费项目 (hpf_chargetype / nc.vo.hpf.chargetype.ChargetypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2611.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chargetype | 主键 | pk_chargetype | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 业务单元编码 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 3 | code | 收费项目编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 收费项目名称 | name | varchar(100) |  | 字符串 (String) |
| 5 | source | 来源 | source | varchar(50) |  | 数据来源 (DataSource) |  | 1=HIS系统; |