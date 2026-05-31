# |<<

**退货政策设置 (so_returnpolicy / nc.vo.so.mreturnpolicy.entity.ReturnPolicyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returnpolicy | 退货政策主键 | pk_returnpolicy | char(20) | √ | 主键 (UFID) |
| 2 | vpolicycode | 退货政策编码 | vpolicycode | varchar(40) |  | 字符串 (String) |
| 3 | vpolicyname | 退货政策名称 | vpolicyname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | vexpressname | 退货政策逻辑表达式 | vexpressname | varchar(50) |  | 字符串 (String) |
| 5 | vpolicydetail | 退货政策说明 | vpolicydetail | varchar(181) |  | 字符串 (String) |
| 6 | dstartdate | 执行开始日期 | dstartdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | denddate | 执行结束日期 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 10 | vexpresscode | 退货政策表达式编码 | vexpresscode | varchar(50) |  | 字符串 (String) |