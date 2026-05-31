# |<<

**授信信息 (cdmc_appauthinfo / nc.vo.cdmc.cdm.apply.applyauthinfo.Applyauthinfo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_authinfo_b | 主键 | pk_authinfo_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | bankprotocolid | 授信协议 | bankprotocolid | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 4 | cccurrtypeid | 授信币种 | cccurrtypeid | varchar(20) |  | 币种 (currtype) |
| 5 | cctypeid | 授信类别 | cctypeid | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 6 | creditcc | 放款占用授信 | creditcc | int |  | 整数 (Integer) |
| 7 | ccamount | 占用授信额度 | ccamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | financorganization | 银行网点 | financorganization | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | creagrtype | 授信类型 | creagrtype | varchar(50) |  | 授信类型 (AuthTypeEnum) |  | GROUP=集团授信; |