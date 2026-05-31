# |<<

**题库题目选项 (uh_qs_tpbank_option / com.yonyou.yh.nhis.pv.qs.vo.TpbankOptionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topic_option | 主键 | pk_topic_option | char(20) | √ | 主键 (UFID) |
| 2 | pk_topic_option | 主键 | pk_topic_option | char(20) | √ | 主键 (UFID) |
| 3 | pk_topic | 所属题目 | pk_topic | char(20) |  | 主键 (UFID) |
| 4 | option_desc | 选项描述 | option_desc | varchar(500) |  | 字符串 (String) |
| 5 | edit_flag | 是否编辑 | edit_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | score | 分值 | score | decimal(12, 4) |  | 数值 (UFDouble) |
| 7 | sort_order | 序号 | sort_order | int |  | 整数 (Integer) |
| 8 | qualified_flag | 是否合格 | qualified_flag | char(1) |  | 布尔类型 (UFBoolean) |