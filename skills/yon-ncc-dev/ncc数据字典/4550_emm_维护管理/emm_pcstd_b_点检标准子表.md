# |<<

**点检标准子表 (emm_pcstd_b / nc.vo.emm.pcstd.PCStdBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcstd_b | 子表 | pk_pcstd_b | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 点检标准编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | pcobject | 点检对象 | pcobject | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | rowno | 序号 | rowno | varchar(30) |  | 字符串 (String) |
| 5 | pc_position | 点检部位 | pc_position | varchar(80) |  | 字符串 (String) |
| 6 | pc_item | 点检项目 | pc_item | varchar(100) |  | 字符串 (String) |
| 7 | pc_content | 点检内容 | pc_content | varchar(200) |  | 字符串 (String) |
| 8 | pc_method | 点检方法 | pc_method | varchar(100) |  | 字符串 (String) |
| 9 | std_need | 标准要求 | std_need | varchar(200) |  | 字符串 (String) |
| 10 | pc_state | 点检状态 | pc_state | int |  | 点检状态 (PCstatenum) |  | 1=运行或停运; |