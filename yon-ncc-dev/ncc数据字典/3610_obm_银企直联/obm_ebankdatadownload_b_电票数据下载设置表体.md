# |<<

**电票数据下载设置表体 (obm_ebankdatadownload_b / nc.vo.obm.ebankdatadownload.EbankDataDownLoadBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3920.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ebankdatadownload_b | 子表主键 | pk_ebankdatadownload_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | xzqsflag | 下载签收 | xzqsflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | xzbsflag | 下载背书 | xzbsflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | xzzyflag | 下载质押/解除质押 | xzzyflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | xzqfflag | 下载签发 | xzqfflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | xztsflag | 下载托收 | xztsflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | xztxflag | 下载贴现 | xztxflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | xzpjflag | 下载票据状态信息 | xzpjflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |