# |<<

**账龄期间设置 (fipub_timecontrol / nc.vo.fipub.timecontrol.TimeCtrlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timectrl | 主键 | pk_timectrl | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 4 | timectrlname | 名称 | timectrlname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | unit | 时间单位 | unit | int |  | 时间单位 (timeunit) |  | 0=日; |